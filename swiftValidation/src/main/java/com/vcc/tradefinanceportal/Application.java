package com.vcc.tradefinanceportal;

import com.vcc.tradefinanceportal.dto.LCDto;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.io.IOException;
import java.util.Set;
//@SwiftType(message = "Input value is invalid",type = "z",length = 16)



public class Application {




    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        LCDto lc = new LCDto("sdfsdg","hghg","2013-13-09", new String[]{"uhioho","gku","ygiyg","uihuo"});


        Set<ConstraintViolation<LCDto>> violations = validator.validate(lc);

        for (ConstraintViolation<LCDto> violation : violations) {
            System.out.println(violation.getMessage());
        }



    }


    @PostMapping(value = "/get-invoice-summary-tmplt")
    public ResponseEntity<?> getInvoiceSummary(@RequestParam("file") MultipartFile file)  {

        ResponseMessage meassage = new ResponseMessage();

        try {
            meassage.setData(supportDataProcessingService.readExcelFile(InvoiceSummaryDTO.class, file,"InvoiceSummary"));
            meassage.setStatusCode(HttpStatus.OK.value());

            return ResponseEntity.ok(meassage);
        } catch (IOException e) {
            e.printStackTrace();

            meassage.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            meassage.setError("Error Occured");

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(meassage);
        }
    }














}

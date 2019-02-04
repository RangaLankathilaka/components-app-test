package com.vcc.tradefinanceportal.controllers.rest.company;

import com.vcc.tradefinanceportal.dto.common.InvoiceListDto;
import com.vcc.tradefinanceportal.dto.company.supportingdata.*;
import com.vcc.tradefinanceportal.dto.core.ResponseMessage;
import com.vcc.tradefinanceportal.service.company.SupportDataProcessingService;
import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.inject.Inject;
import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("${spring.data.rest.base-path}/supportdata")
public class SupportDataController {

    private @Inject
    SupportDataProcessingService supportDataProcessingService;

    private @Inject ResponseMessage meassage ;


    @GetMapping(value = "/download-po-tmplt")
    public ResponseEntity downloadTemplate() throws IOException {

        File returnFile = supportDataProcessingService.GenerateExcelFile(PODTO.class,"PurchaseOrder");//GenerateExcelFile(POListDto.class,"PurchaseOrder");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"po-template.xlsx\"")
                .body(FileUtils.readFileToByteArray(returnFile));
    }

    @GetMapping(value = "/download-invoice-tmplt")
    public ResponseEntity  downloadInvoice() throws IOException {

        File returnFile = supportDataProcessingService.GenerateExcelFile(InvoiceDTO.class, "Invoice");//GenerateExcelFile(InvoiceListDto.class, "Invoice");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"invoice-template.xlsx\"")
                .body(FileUtils.readFileToByteArray(returnFile));
    }

    @GetMapping(value = "/download-credit-debit-note-tmplt")
    public ResponseEntity  downloadCreditDebitNote() throws IOException {

        File returnFile = supportDataProcessingService.GenerateExcelFile(CreditDebitNoteDTO.class, "CreditDebitNote");//GenerateExcelFile(InvoiceListDto.class, "Invoice");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"credit-debit-note-template.xlsx\"")
                .body(FileUtils.readFileToByteArray(returnFile));
    }


    @GetMapping(value = "/download-invoice-summary-tmplt")
    public ResponseEntity  downloadInvoiceSummary() throws IOException {

        File returnFile = supportDataProcessingService.GenerateExcelFile(InvoiceSummaryDTO.class, "InvoiceSummary");//GenerateExcelFile(InvoiceListDto.class, "Invoice");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"invoice-summary-template.xlsx\"")
                .body(FileUtils.readFileToByteArray(returnFile));
    }

    @GetMapping(value = "/download-proforma-invoice-tmplt")
    public ResponseEntity  downloadProformaInvoice() throws IOException {

        File returnFile = supportDataProcessingService.GenerateExcelFile(ProformaInvoiceDTO.class, "proformaInvoice");//GenerateExcelFile(InvoiceListDto.class, "Invoice");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"proforma-invoice-template.xlsx\"")
                .body(FileUtils.readFileToByteArray(returnFile));
    }

    @GetMapping(value = "/download-transport-data-tmplt")
    public ResponseEntity  downloadTransportData() throws IOException {

        File returnFile = supportDataProcessingService.GenerateExcelFile(TransportDataDTO.class, "TransportData");//GenerateExcelFile(InvoiceListDto.class, "Invoice");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"transport-data-template.xlsx\"")
                .body(FileUtils.readFileToByteArray(returnFile));
    }

    @PostMapping(value = "/get-invoice")
    public ResponseEntity<?> getInvoice(@RequestParam("file") MultipartFile file)  {


        try {
            meassage.setData(supportDataProcessingService.readExcelFile(InvoiceDTO.class, file,"Invoice"));
            meassage.setStatusCode(HttpStatus.OK.value());
            return ResponseEntity.ok(meassage);

        } catch (IOException e) {
            e.printStackTrace();
            meassage.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            meassage.setError("Error Occured");

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(meassage);
        }
    }

    @PostMapping(value = "/get-purchase-order")
    public ResponseEntity<?> getPurchaseOrder(@RequestParam("file") MultipartFile file) {

        try {
            meassage.setData(supportDataProcessingService.readExcelFile(PODTO.class, file,"PurchaseOrder"));
            meassage.setStatusCode(HttpStatus.OK.value());

            return ResponseEntity.ok(meassage);

        } catch (IOException e) {
            e.printStackTrace();
            meassage.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            meassage.setError("Error Occured");

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(meassage);
        }
    }

    @PostMapping(value = "/get-credit-debit-note")
    public ResponseEntity<?> getCreditDebitNote(@RequestParam("file") MultipartFile file){


        try {
            meassage.setData(supportDataProcessingService.readExcelFile(CreditDebitNoteDTO.class, file,"CreditDebitNote"));
            meassage.setStatusCode(HttpStatus.OK.value());

            return ResponseEntity.ok(meassage);

        } catch (IOException e) {
            e.printStackTrace();
            meassage.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            meassage.setError("Error Occured");

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(meassage);
        }
    }

    @PostMapping(value = "/get-invoice-summary")
    public ResponseEntity<?> getInvoiceSummary(@RequestParam("file") MultipartFile file)  {

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

    @PostMapping(value = "/get-proforma-invoice")
    public ResponseEntity<?> getProformaInvoice(@RequestParam("file") MultipartFile file) {

        try {
            meassage.setData(supportDataProcessingService.readExcelFile(ProformaInvoiceDTO.class, file,"proformaInvoice"));
            meassage.setStatusCode(HttpStatus.OK.value());

            return ResponseEntity.ok(meassage);

        } catch (IOException e) {
            e.printStackTrace();
            meassage.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            meassage.setError("Error Occured");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(meassage);
        }
    }


    @PostMapping(value = "/get-transport-data")
    public ResponseEntity<?> getTransportData(@RequestParam("file") MultipartFile file) {

        try {
            meassage.setData(supportDataProcessingService.readExcelFile(TransportDataDTO.class, file,"TransportData"));
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

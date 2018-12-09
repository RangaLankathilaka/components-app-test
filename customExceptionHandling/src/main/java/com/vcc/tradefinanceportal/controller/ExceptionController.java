package com.vcc.tradefinanceportal.controller;


import com.vcc.tradefinanceportal.customException.CustomException;
import com.vcc.tradefinanceportal.customException.CustomException1;
import com.vcc.tradefinanceportal.customException.CustomException2;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/exceptions")
public class ExceptionController {

    //for custom 1 customException
    @RequestMapping("/exception1")
    public String exception1(){

           throw new CustomException("Base Exception");
    }

    //for custom 2 customException
    @RequestMapping("/exception2")
    public void exception2(){

            throw new CustomException1();

    }

    //for custom 2 customException
    @RequestMapping("/exception3")
    public void exception3(){


            throw new CustomException2();

    }
    //for null values
    @RequestMapping("/exception4")
    public String exception4(){

        throw new NullPointerException("null pointer customException");
    }

    //for number format
    @RequestMapping("/exception5")
    public String exception5(){

        throw new NumberFormatException("number format customException");
    }

    //for number format customException arise within this controller
    @ExceptionHandler(value = NumberFormatException.class)
    public String nfeHandler(NumberFormatException e){
        return e.getMessage();
    }

    public String someMethod() {
        try {
            // do some stuff here
            return "something";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}

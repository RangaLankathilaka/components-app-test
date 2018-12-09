package com.vcc.tradefinanceportal.customException;


import com.vcc.tradefinanceportal.util.messages.error.ErrorCodes;

public class CustomException1 extends CustomException {

    public CustomException1() {
        super(ErrorCodes.CUSTOM_EXCEPTION_1);
    }
}

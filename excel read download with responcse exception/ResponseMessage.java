package com.vcc.tradefinanceportal.dto.core;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;



@Data
@NoArgsConstructor
@Component
public class ResponseMessage implements Serializable {

    private static final long serialVersionUID = 4557651712310010802L;

    private Object data;
    private String error;
    //private String success;
    private int statusCode;
}
package com.noetic.pos.dto.common;

import java.io.Serializable;
import org.springframework.http.HttpStatus;

import com.noetic.pos.dto.common.enums.ResultStatus;

public class ResponseDTO<T> extends ResultsDTO implements Serializable {

    private T payloadDto;

    public ResponseDTO() {
    }

    public ResponseDTO(T payloadDto) {
        this.payloadDto = payloadDto;
    }

    public ResponseDTO(MessageDTO message, ResultStatus resultStatus, HttpStatus httpStatus, String httpCode,
                       T payloadDto) {
        super(message, resultStatus, httpStatus, httpCode);
        this.payloadDto = payloadDto;
    }

    public void setPayload(T payloadDto) {
        this.payloadDto = payloadDto;
    }

    public T getPayload() {
        return payloadDto;
    }

}
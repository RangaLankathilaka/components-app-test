package com.noetic.pos.dto.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class BaseResponseDTO {

    private String timestamp;
    private String merchantId;
    private String account;
    private String orderId;
    private String authCode;
    private String result;
    private Long batchId;
    private String message;
    private String paymentsReference;
    private Long timetaken;
    private String sha1Hash;

    public BaseResponseDTO() {
    }

    public BaseResponseDTO(String timestamp, String merchantId, String account, String orderId, String authCode,
            String result, Long batchId, String message, String paymentsReference, Long timetaken, String sha1Hash) {

        this.timestamp = timestamp;
        this.merchantId = merchantId;
        this.account = account;
        this.orderId = orderId;
        this.authCode = authCode;
        this.result = result;
        this.batchId = batchId;
        this.message = message;
        this.paymentsReference = paymentsReference;
        this.timetaken = timetaken;
        this.sha1Hash = sha1Hash;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPaymentsReference() {
        return paymentsReference;
    }

    public void setPaymentsReference(String paymentsReference) {
        this.paymentsReference = paymentsReference;
    }

    public Long getTimetaken() {
        return timetaken;
    }

    public void setTimetaken(Long timetaken) {
        this.timetaken = timetaken;
    }

    public String getSha1Hash() {
        return sha1Hash;
    }

    public void setSha1Hash(String sha1Hash) {
        this.sha1Hash = sha1Hash;
    }
}

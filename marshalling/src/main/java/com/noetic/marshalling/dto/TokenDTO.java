package com.noetic.marshalling.dto;


public class TokenDTO {

	    private String eMerchantID;
	    private String validationCode;
	    private String tokenNo;
	    private String merchantRef;
	    private String optionFlags;
		
	    public TokenDTO() {
			super();
		}
		public TokenDTO(String eMerchantID, String validationCode, String tokenNo, String merchantRef,
				String optionFlags) {
			super();
			this.eMerchantID = eMerchantID;
			this.validationCode = validationCode;
			this.tokenNo = tokenNo;
			this.merchantRef = merchantRef;
			this.optionFlags = optionFlags;
		}
		public String geteMerchantID() {
			return eMerchantID;
		}
		public void seteMerchantID(String eMerchantID) {
			this.eMerchantID = eMerchantID;
		}
		public String getValidationCode() {
			return validationCode;
		}
		public void setValidationCode(String validationCode) {
			this.validationCode = validationCode;
		}
		public String getTokenNo() {
			return tokenNo;
		}
		public void setTokenNo(String tokenNo) {
			this.tokenNo = tokenNo;
		}
		public String getMerchantRef() {
			return merchantRef;
		}
		public void setMerchantRef(String merchantRef) {
			this.merchantRef = merchantRef;
		}
		public String getOptionFlags() {
			return optionFlags;
		}
		public void setOptionFlags(String optionFlags) {
			this.optionFlags = optionFlags;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("TokenDTO [eMerchantID=");
			builder.append(eMerchantID);
			builder.append(", validationCode=");
			builder.append(validationCode);
			builder.append(", tokenNo=");
			builder.append(tokenNo);
			builder.append(", merchantRef=");
			builder.append(merchantRef);
			builder.append(", optionFlags=");
			builder.append(optionFlags);
			builder.append("]");
			return builder.toString();
		}
	    
	    
	
}

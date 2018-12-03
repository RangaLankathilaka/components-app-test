package com.vcc.tradefinanceportal.dto;

import javax.xml.bind.annotation.XmlElement;

public class BankGaranteeDTO {



    private String UniqueTFApplicationIdentifier;

    private String CompanyOwnRefNo;


    public BankGaranteeDTO() {
    }

    public BankGaranteeDTO(String uniqueTFApplicationIdentifier, String companyOwnRefNo) {
        UniqueTFApplicationIdentifier = uniqueTFApplicationIdentifier;
        CompanyOwnRefNo = companyOwnRefNo;
    }


    public String getUniqueTFApplicationIdentifier() {
        return UniqueTFApplicationIdentifier;
    }
    @XmlElement(name = "TFAP_ID", required = true)
    public void setUniqueTFApplicationIdentifier(String uniqueTFApplicationIdentifier) {
        UniqueTFApplicationIdentifier = uniqueTFApplicationIdentifier;
    }

    public String getCompanyOwnRefNo() {
        return CompanyOwnRefNo;
    }
    @XmlElement(name = "APPL_COY_REF_NO", required = true)
    public void setCompanyOwnRefNo(String companyOwnRefNo) {
        CompanyOwnRefNo = companyOwnRefNo;
    }


    @Override
    public String toString() {
        return "LCIssuanceDTO{" +
                "UniqueTFApplicationIdentifier='" + UniqueTFApplicationIdentifier + '\'' +
                ", CompanyOwnRefNo='" + CompanyOwnRefNo + '\'' +
                '}';
    }
}

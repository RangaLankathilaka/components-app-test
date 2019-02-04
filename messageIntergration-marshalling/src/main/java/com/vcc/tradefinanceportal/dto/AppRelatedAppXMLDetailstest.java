package com.vcc.tradefinanceportal.dto;


public class AppRelatedAppXMLDetailstest {

 private LCIssuanceDTO lcIssuance;

    public AppRelatedAppXMLDetailstest() {
    }


    public AppRelatedAppXMLDetailstest(LCIssuanceDTO lcIssuance) {
        this.lcIssuance = lcIssuance;
    }


    public LCIssuanceDTO getLcIssuance() {
        return lcIssuance;
    }

    public void setLcIssuance(LCIssuanceDTO lcIssuance) {
        this.lcIssuance = lcIssuance;
    }

    @Override
    public String toString() {
        return "AppRelatedAppXMLDetailstest{" +
                "lcIssuance=" + lcIssuance +
                '}';
    }
}

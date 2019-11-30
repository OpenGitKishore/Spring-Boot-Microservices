package com.practice.testdemo.model;

public class Payees {

    private String payeeId;
    private String payeeType;
    private String logoURI;

    public Payees() {
    }

    public Payees(String payeeId, String payeeType, String logoURI) {
        this.payeeId = payeeId;
        this.payeeType = payeeType;
        this.logoURI = logoURI;
    }

    public String getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId;
    }

    public String getPayeeType() {
        return payeeType;
    }

    public void setPayeeType(String payeeType) {
        this.payeeType = payeeType;
    }

    public String getLogoURI() {
        return logoURI;
    }

    public void setLogoURI(String logoURI) {
        this.logoURI = logoURI;
    }

    @Override
    public String toString() {
        return "Payees{" +
                "payeeId='" + payeeId + '\'' +
                ", payeeType='" + payeeType + '\'' +
                ", logoURI='" + logoURI + '\'' +
                '}';
    }
}

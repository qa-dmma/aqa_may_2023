package com.hillel.enums;

public enum AccStatus {
    STANDART("Standart"),
    STANDARTGOLD("Standart GOLD"),
    UNIVERSAL("Universal"),
    BLACK("Black Edition");
    private String AccountStatus;

    AccStatus(String AccountStatus) {
        this.AccountStatus = AccountStatus;
    }

    public String getAccountStatus() {
        return AccountStatus;
    }
}

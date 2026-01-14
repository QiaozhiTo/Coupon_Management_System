package com.imooc.passbook.merchants.constant;

public enum ErrorCode {
    SUCCESS(0, ""),
    DUPLICATE_NAME(1, "Merchant repeated"),
    EMPTY_LOGO(2, "Merchant Logo is empty"),
    EMPTY_BUSINESS_LICENSE(3, "Merchant license is empty"),
    ERROR_PHONE(4, "Wrong merchant phone number"),
    EMPTY_ADDRESS(5, "Wrong merchant address"),
    MERCHANT_NOT_EXIST(6, "Merchant is not existing");


    private int code;
    private String desc;


    ErrorCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }


}

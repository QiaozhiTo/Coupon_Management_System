package com.imooc.passbook.merchants.constant;

public enum TemplateColor {
    RED(1, "Red"),
    GREEN(2, "Green"),
    Blue(3, "Blue");


    //    color code
    private Integer code;

//    color info
    private String color;


    TemplateColor(Integer code, String color) {
        this.code = code;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Integer getCode() {
        return code;
    }



}

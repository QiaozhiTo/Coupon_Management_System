package com.imooc.passbook.merchants.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//通用的相应对象 http的response
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {
//     error code , return 0 if correct
    private int errorCode = 0;
//    error message, return blank if correct
    private String errorMsg = "";
//    返回值对象
    private Object data;
//    correct response constructor
    public Response(Object data) {
        this.data = data;
    }

}

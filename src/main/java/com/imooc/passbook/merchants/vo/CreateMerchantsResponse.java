package com.imooc.passbook.merchants.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
create merchant response object
 */
// when define an object, we will need the three
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateMerchantsResponse {
//    merchant id, -1 when fail to create
    private Integer id;

}

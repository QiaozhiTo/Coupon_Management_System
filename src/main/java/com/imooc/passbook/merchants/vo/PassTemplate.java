package com.imooc.passbook.merchants.vo;

import com.imooc.passbook.merchants.constant.ErrorCode;
import com.imooc.passbook.merchants.dao.MerchantsDao;

import java.util.Date;

// coupon object 投放的优惠券对象定义
public class PassTemplate {
//     merchant id
    private Integer id;
//    coupon title
    private String title;
//    coupon summary
    private String summary;

    private String desc;
//    limit of coupon
    private Long limit;
//    coupon has token or not
    private Boolean hasToken;
//    coupon background color
    private Integer background;
//    coupon start time
    private Date start;
//    coupon end time
    private Date end;
    /*
    check coupon availability
    @para merchantsDao {@link MerchantsDao}
    @return {@link ErrorCode}
     */
    public ErrorCode validate(MerchantsDao merchantsDao) {
        if (null == merchantsDao.findById(id)) {
            return ErrorCode.MERCHANT_NOT_EXIST;
        }
        return ErrorCode.SUCCESS;


    }

}

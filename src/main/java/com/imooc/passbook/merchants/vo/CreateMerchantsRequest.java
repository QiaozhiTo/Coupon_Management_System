package com.imooc.passbook.merchants.vo;

import com.imooc.passbook.merchants.constant.ErrorCode;
import com.imooc.passbook.merchants.dao.MerchantsDao;
import com.imooc.passbook.merchants.entity.Merchants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//create merchants request object
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CreateMerchantsRequest {
//     merchant name
    private String name;
//    merchant logo
    private String logoUrl;
//    business license url
    private String businessLicenseUrl;

    private String phone;

    private String address;

    public ErrorCode validate(MerchantsDao merchantsDao) {
//        验证请求有效性
//        @==param merchantsDao @link MerchantsDao
//        @return {@link ErrorCode}
        if (merchantsDao.findByName(this.name) != null) {
            return ErrorCode.DUPLICATE_NAME;
        }
        if (null == this.logoUrl) {
            return ErrorCode.EMPTY_LOGO;
        }
        if (null == this.businessLicenseUrl) {
            return ErrorCode.EMPTY_BUSINESS_LICENSE;
        }

        if (null == this.address) {
            return ErrorCode.EMPTY_ADDRESS;
        }
        if (null == this.phone) {
            return ErrorCode.ERROR_PHONE;
        }
        return ErrorCode.SUCCESS;
    }

//    convert request object to merchant object;
//    将请求对象转换为商户对象
//    after requesting to become merchant object we need to response to this request ->  a new object CreateMerchantsResponse under vo
    public Merchants toMerchants() {
        Merchants merchants = new Merchants();
        merchants.setName(name);
        merchants.setLogoUrl(logoUrl);
        merchants.setBusinessLicenseUrl(businessLicenseUrl);
        merchants.setPhone(phone);
        merchants.setAddress(address);
        return merchants;
    }

}

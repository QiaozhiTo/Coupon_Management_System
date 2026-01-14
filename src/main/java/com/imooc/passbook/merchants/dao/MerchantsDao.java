package com.imooc.passbook.merchants.dao;

import com.imooc.passbook.merchants.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantsDao extends JpaRepository<Merchants, Integer> {
//    get merchant by id
//    Merchants findById(Integer id);

    Merchants findByName(String name);


}

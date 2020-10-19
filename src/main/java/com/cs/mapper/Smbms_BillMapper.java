package com.cs.mapper;

import com.cs.entity.Smbms_Bill;

import java.util.List;

public interface Smbms_BillMapper {

    //select * from smbms_bill 查询所有商品信息
    public List<Smbms_Bill> findAllBill() throws Exception;
}

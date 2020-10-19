package com.cs.mapper;

import com.cs.entity.Smbms_Bill;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Smbms_BillMapper {

    //select * from smbms_bill 查询所有商品信息
    @Select("select * from smbms_bill")
    public List<Smbms_Bill> findAllBill() throws Exception;
}

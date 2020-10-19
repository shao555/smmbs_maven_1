package com.cs.mapper;

import com.cs.entity.Smbms_Address;

import java.util.List;

public interface Smbms_AddressMapper {


    //select * from smbms_address 查询所有地址信息
    public List<Smbms_Address> findAllAddress() throws Exception;

}

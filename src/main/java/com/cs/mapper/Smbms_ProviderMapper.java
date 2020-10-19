package com.cs.mapper;

import com.cs.entity.Smbms_Provider;

import java.util.List;

public interface Smbms_ProviderMapper {

    //select * from smbms_provider 查询所有供应商信息
    public List<Smbms_Provider> findAllProvider() throws Exception;
}

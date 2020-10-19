package com.cs.mapper;

import com.cs.entity.Smbms_Provider;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Smbms_ProviderMapper {

    //select * from smbms_provider 查询所有供应商信息
    @Select("select * from smbms_provider")
    public List<Smbms_Provider> findAllProvider() throws Exception;
}

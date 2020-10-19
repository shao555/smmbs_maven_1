package com.cs.mapper;

import com.cs.entity.Smbms_Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Smbms_RoleMapper {

    //select * from smbms_role 查询所有角色信息
    @Select("select * from smbms_role")
    public List<Smbms_Role> findAllRole() throws Exception;
}

package com.cs.mapper;

import com.cs.entity.Smbms_User;

import java.util.List;

public interface Smbms_UserMapper {

    //select * from smbms_user 查询所有用户信息
    public List<Smbms_User> findAllUser() throws Exception;
}

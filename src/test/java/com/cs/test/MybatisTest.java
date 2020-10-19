package com.cs.test;

import com.cs.entity.*;
import com.cs.mapper.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    public static void main(String[] args) throws Exception {

//        findAddress(); //查询所有地址信息
        findBill(); //查询所有商品信息
//        findProvider(); //查询所有供应商信息
//        findRole(); //查询所有商品信息

//        findUser(); //查询所有用户信息

    }

    private static void findUser() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory ssf = builder.build(is);
        SqlSession ss = ssf.openSession();
        List<Smbms_User> ulist = ss.getMapper(Smbms_UserMapper.class).findAllUser();
        for (Smbms_User su : ulist) {
            System.out.println(
                    su.getId() + " " + su.getUserCode() + " " + su.getUserName() + " "
                    + su.getUserPassword() + " " + su.getGender() + " " + su.getBirthday()
                    + " " + su.getPhone() + " " + su.getAddress() + " " + su.getUserRole()
                    + " " + su.getCreateBy() + " " + su.getCreationDate() + " " + su.getModifyBy()
                    + " " + su.getModifyDate() + " " + su.getIdPicPath() + " " + su.getWorkPicPath()
            );
        }
    }

    private static void findRole() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory ssf = builder.build(is);
        SqlSession ss = ssf.openSession();
        List<Smbms_Role> rlist = ss.getMapper(Smbms_RoleMapper.class).findAllRole();
        for (Smbms_Role sr : rlist) {
            System.out.println(
                    sr.getId() + " " + sr.getRoleCode() + " " + sr.getRoleName()
                    + " " + sr.getCreateBy() + " " + sr.getCreationDate() + " " + sr.getModifyBy()
                    + " " + sr.getModifyDate()
            );
        }
    }

    private static void findProvider() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory ssf = builder.build(is);
        SqlSession ss = ssf.openSession();
        List<Smbms_Provider> plist = ss.getMapper(Smbms_ProviderMapper.class).findAllProvider();
        for (Smbms_Provider sp : plist) {
            System.out.println(
                    sp.getId() + " " + sp.getProCode() + " " + sp.getProName() + " " + sp.getProDesc()
                    + " " + sp.getProContact() + " " + sp.getProPhone() + " " + sp.getProAddress()
                    + " " + sp.getProFax() + " " + sp.getCreatedBy() + " " + sp.getCreationDate()
                    + " " + sp.getModifyDate() + " " + sp.getModifyBy()
            );
        }
    }

    private static void findBill() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory ssf = builder.build(is);
        SqlSession ss = ssf.openSession();
        List<Smbms_Bill> blist = ss.getMapper(Smbms_BillMapper.class).findAllBill();
        for (Smbms_Bill sb : blist) {
            System.out.println(
                    sb.getId() + " " + sb.getBillCode() + " " + sb.getProductName() + " " + sb.getProductDesc() + " "
                    + sb.getProductUnit() + " " + sb.getProductCount() + " " + sb.getTotalPrice() + " " + sb.getIsPayment()
                    + " " + sb.getCreateBy() + " " + sb.getCreationDate() + " " + sb.getModifyBy() + " " + sb.getModifyDate()
                    + " " + sb.getProviderId()
            );
        }
    }

    private static void findAddress() throws Exception {
        //1.读取mybatis核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //2.创建工厂对象
        SqlSessionFactoryBuilder builder =new SqlSessionFactoryBuilder();
        SqlSessionFactory ssf = builder.build(is);
        //3.使用工厂对象创建会话sqlsession
        SqlSession ss = ssf.openSession();
        //4.使用会话调用方法执行sql
        //5.数据的处理
        List<Smbms_Address> alist = ss.getMapper(Smbms_AddressMapper.class).findAllAddress();
        for (Smbms_Address sa : alist) {
            System.out.println(
                    sa.getId() + " "  + sa.getContact() + " " + sa.getAddressDesc() + " " + sa.getPostCode() + " "
                    + sa.getTel() + " "  + sa.getCreateBy() + " " + sa.getCreationDate() + " " + sa.getModifyBy() + " "
                    + sa.getModifyDate() + " " + sa.getUserId()
            );
        }
        ss.close();
        is.close();
    }
}

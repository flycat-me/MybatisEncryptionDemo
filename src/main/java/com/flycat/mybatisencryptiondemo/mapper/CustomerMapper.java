package com.flycat.mybatisencryptiondemo.mapper;

import com.flycat.mybatisencryptiondemo.entity.Customer;
import com.flycat.mybatisencryptiondemo.entity.Encrypt;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CustomerMapper {

    @Insert("insert into customer(phone, address) values (#{phone},#{address})")
    void saveCustomer(@Param("phone") Encrypt phone, @Param("address") String address);

    @Select("select * FROM customer where phone = #{phone} limit 1")
    Customer getByPhone(@Param("phone") Encrypt phone);

    @Select("select * FROM customer where phone like concat('%',#{phone},'%')")
    List<Customer> getListCustomer(@Param("phone") Encrypt phone);
}

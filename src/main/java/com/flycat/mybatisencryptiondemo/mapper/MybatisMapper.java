package com.flycat.mybatisencryptiondemo.mapper;

import com.flycat.mybatisencryptiondemo.entity.Mybatis;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;

@Mapper
public interface MybatisMapper {

    @Insert("insert into mybatis(name,time) values (#{name},#{time})")
    int save(@Param("name") String name, @Param("time")Date time);

    @Select("select * from mybatis limit 1")
    Mybatis getOne();
}

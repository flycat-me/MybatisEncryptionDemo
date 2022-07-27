package com.flycat.mybatisencryptiondemo.mapper;

import com.flycat.mybatisencryptiondemo.entity.EncryptedData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @author flycat
 * @since 2022-07-25 22:32
 **/
@Mapper
@Component
public interface MapperTest {

    @Select("SELECT * FROM encrypted LIMIT 1")
    EncryptedData getData();
}

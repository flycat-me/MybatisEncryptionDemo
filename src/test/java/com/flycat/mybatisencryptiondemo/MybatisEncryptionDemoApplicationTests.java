package com.flycat.mybatisencryptiondemo;

import com.flycat.mybatisencryptiondemo.mapper.MapperTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisEncryptionDemoApplicationTests {

    @Autowired
    private MapperTest mapperTest;

    @Test
    void contextLoads() {
        System.out.println(mapperTest.getData());
    }

}

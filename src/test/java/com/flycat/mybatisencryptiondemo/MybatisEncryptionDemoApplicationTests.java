package com.flycat.mybatisencryptiondemo;

import com.flycat.mybatisencryptiondemo.entity.Customer;
import com.flycat.mybatisencryptiondemo.entity.Encrypt;
import com.flycat.mybatisencryptiondemo.mapper.CustomerMapper;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisEncryptionDemoApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(MybatisEncryptionDemoApplicationTests.class);

    @Autowired
    private CustomerMapper customerMapper;


    @Test
    void TypeHandlerTest(){
        customerMapper.saveCustomer(new Encrypt("phone66"),"address");
        Customer phone = customerMapper.getByPhone(new Encrypt("phone66"));
        System.out.println(phone.getPhone().getValue());
    }

}

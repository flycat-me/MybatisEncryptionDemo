package com.flycat.mybatisencryptiondemo;

import com.flycat.mybatisencryptiondemo.entity.EncryptedData;
import com.flycat.mybatisencryptiondemo.mapper.EncryptedDataMapper;
import com.flycat.mybatisencryptiondemo.mapper.MapperTest;
import com.stableforever.mybatis.encryption.alias.EncryptedString;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisEncryptionDemoApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(MybatisEncryptionDemoApplicationTests.class);

    @Autowired
    private MapperTest mapperTest;

    @Autowired
    private EncryptedDataMapper encryptedDataMapper;

    @Test
    void contextLoads() {
        System.out.println(encryptedDataMapper.getEncrypted(10).getEncryptedData());
    }

    @Test
    void EncryptedTest(){

        EncryptedData newDate = new EncryptedData();
        newDate.setEncryptedData(new EncryptedString("中文测试一"));
        encryptedDataMapper.saveEncrypted(newDate);
        EncryptedData data = encryptedDataMapper.getEncrypted(newDate.getId());
        log.info("Item {}", data);
        EncryptedData queryResult = encryptedDataMapper.queryData(new EncryptedString("中文"));
        log.info("query result {}", queryResult.getEncryptedData().getValue());
    }

}

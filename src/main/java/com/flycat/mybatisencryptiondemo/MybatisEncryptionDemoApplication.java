package com.flycat.mybatisencryptiondemo;

import com.flycat.mybatisencryptiondemo.entity.EncryptedData;
import com.flycat.mybatisencryptiondemo.mapper.EncryptedDataMapper;
import com.stableforever.mybatis.encryption.alias.EncryptedString;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//@SpringBootApplication
//public class MybatisEncryptionDemoApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(MybatisEncryptionDemoApplication.class, args);
//    }
//
//}

@SpringBootApplication
@MapperScans({
        @MapperScan(basePackages = "com.flycat.mybatisencryptiondemo.mapper")
})
@Slf4j
public class MybatisEncryptionDemoApplication implements ApplicationContextAware {
    public static void main(String[] args) {
        SpringApplication.run(MybatisEncryptionDemoApplication.class, args);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        EncryptedDataMapper mapper = applicationContext.getBean(EncryptedDataMapper.class);
        EncryptedData newDate = new EncryptedData();
        newDate.setEncryptedData(new EncryptedString("中文测试一"));
        mapper.saveEncrypted(newDate);
        EncryptedData data = mapper.getEncrypted(newDate.getId());
        log.info("Item {}", data);
        EncryptedData queryResult = mapper.queryData(new EncryptedString("中文"));
        log.info("query result {}", queryResult);
    }
}

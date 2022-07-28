package com.flycat.mybatisencryptiondemo.controller;


import com.flycat.mybatisencryptiondemo.entity.EncryptedData;
import com.flycat.mybatisencryptiondemo.mapper.EncryptedDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2")
public class TestController {

    @Autowired
    private EncryptedDataMapper mapper;

    @GetMapping("/one")
    public EncryptedData getByID(@RequestParam("id") int id){
        return mapper.getEncrypted(id);
    }
}

package com.flycat.mybatisencryptiondemo.controller;

import com.flycat.mybatisencryptiondemo.entity.Customer;
import com.flycat.mybatisencryptiondemo.entity.Encrypt;
import com.flycat.mybatisencryptiondemo.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class TestController {

    @Autowired
    private CustomerMapper mapper;

    @GetMapping("/customer")
    public Customer getCustomer(@RequestParam("phone") Encrypt phone){
        return mapper.getByPhone(phone);
    }

    @GetMapping("/customer/like")
    public List<Customer> getListCustomer(@RequestParam("phone") Encrypt phone){
        return mapper.getListCustomer(phone);
    }

}

package com.flycat.mybatisencryptiondemo.entity;


import lombok.ToString;

import java.util.List;
@ToString
public class Customer {
    
    private Integer id;
    
    private Encrypt phone;
    
    private String address;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Encrypt getPhone() {
        return phone;
    }
    
    public void setPhone(Encrypt phone) {
        this.phone = phone;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
}

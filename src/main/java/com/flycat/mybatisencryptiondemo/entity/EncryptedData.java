package com.flycat.mybatisencryptiondemo.entity;

import com.stableforever.mybatis.encryption.alias.EncryptedString;
import lombok.Data;
import lombok.ToString;

@Data
public class EncryptedData {
    private int id;
    private EncryptedString encryptedData;
}
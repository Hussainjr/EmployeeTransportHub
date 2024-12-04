package com.crm.crm.payload;

import jakarta.persistence.Column;
import lombok.Data;

import java.sql.Timestamp;
@Data

public class CustomerDto {

    private Long id;

    private String name;

    private String address;

    private Timestamp createTime;

    private Float balance;

    private Character type;

}

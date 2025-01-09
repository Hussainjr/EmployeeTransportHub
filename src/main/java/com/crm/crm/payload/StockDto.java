package com.crm.crm.payload;

import com.crm.crm.entity.Transaction;
import lombok.Data;

@Data
public class StockDto {


    private Long id;

    private Transaction transaction;

    private String name;

    private String code;

}

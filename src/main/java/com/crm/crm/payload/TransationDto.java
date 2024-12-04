package com.crm.crm.payload;

import com.crm.crm.entity.Broker;
import com.crm.crm.entity.Customer;
import lombok.Data;

import java.sql.Timestamp;
@Data
public class TransationDto {


    private Long id;

    private Character type;

    private Timestamp createTime;

    private Timestamp exceutionTime;

    private Timestamp cancellationTime;

    private Customer customer;

    private Broker broker;

}

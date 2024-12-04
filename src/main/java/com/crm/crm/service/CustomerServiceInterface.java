package com.crm.crm.service;

import com.crm.crm.payload.CustomerDto;

import java.util.List;

public interface CustomerServiceInterface {

    public CustomerDto saveCustomer(CustomerDto dto);

    public void deleteCustomer(Long id);

    public CustomerDto updateCustomer(Long id, CustomerDto dto);

    public List<CustomerDto> getAllCustomer();

}

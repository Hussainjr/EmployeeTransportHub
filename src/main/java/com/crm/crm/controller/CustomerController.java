package com.crm.crm.controller;

import com.crm.crm.payload.CustomerDto;
import com.crm.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @PostMapping("/createCustomer")
    public ResponseEntity<CustomerDto> createCustomer(@RequestBody CustomerDto dto){
        CustomerDto customerDto = customerService.saveCustomer(dto);
        return new ResponseEntity<>(customerDto, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteCustomerById(Long id){
        customerService.deleteCustomer(id);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);
    }

    @PostMapping("/updateCustomer")
    public ResponseEntity<CustomerDto> updateCustomerById(Long id, @RequestBody CustomerDto dto){
        CustomerDto customerDto = customerService.updateCustomer(id, dto);
        return new ResponseEntity<>(customerDto, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<CustomerDto>> getAllCustomer(){
        List<CustomerDto> allCustomer = customerService.getAllCustomer();
        return new ResponseEntity<>(allCustomer,HttpStatus.OK);
    }


}

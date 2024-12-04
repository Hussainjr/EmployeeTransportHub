package com.crm.crm.service;

import com.crm.crm.entity.Customer;
import com.crm.crm.payload.CustomerDto;
import com.crm.crm.respository.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements CustomerServiceInterface{

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CustomerDto saveCustomer(CustomerDto dto) {

        Customer map = modelMapper.map(dto, Customer.class);
        Customer save = customerRepository.save(map);
        CustomerDto customerDto = modelMapper.map(save, CustomerDto.class);
        return customerDto;
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);

    }

    @Override
    public CustomerDto updateCustomer(Long id, CustomerDto dto) {
        Optional<Customer> byId = customerRepository.findById(id);

        // If not found, throw an exception or return an error message
        if (byId.isEmpty()) {
            throw new RuntimeException("Customer with ID " + id + " not found.");  // Custom exception is better
        }

        // If found, update the customer
        Customer customer = byId.get();
        customer.setAddress(dto.getAddress());
        customer.setType(dto.getType());
        customer.setName(dto.getName());
        customer.setBalance(dto.getBalance());
        customer.setCreateTime(dto.getCreateTime());

        // Save the updated customer
        Customer savedCustomer = customerRepository.save(customer);

        // Convert the saved entity to CustomerDto
        return modelMapper.map(savedCustomer, CustomerDto.class);
    }

    @Override
    public List<CustomerDto> getAllCustomer() {
        List<Customer> all = customerRepository.findAll();
        return all.stream().map((element) -> modelMapper.map(element, CustomerDto.class)).toList();
    }
}

package com.crm.crm.service;

import com.crm.crm.entity.Broker;
import com.crm.crm.payload.BrokerDto;
import com.crm.crm.respository.BrokerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BrockerService implements BrokerServiceInterface {

    @Autowired
    private BrokerRepository brokerRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public BrokerDto saveBroker(BrokerDto dto) {
        Broker broker = modelMapper.map(dto, Broker.class);
        Broker save = brokerRepository.save(broker);
        BrokerDto brokerDto = modelMapper.map(save, BrokerDto.class);
        return brokerDto;
    }

    @Override
    public void deleteBroker(Long id) {
        brokerRepository.deleteById(id);
    }

    @Override
    public BrokerDto updateBroker(Long id, BrokerDto dto) {

        Optional<Broker> byId = brokerRepository.findById(id);

        if (byId.isEmpty()) {
            throw new RuntimeException("broker with ID " + id + " not found.");  // Custom exception is better
        }
        Broker broker = byId.get();
        broker.setName(dto.getName());
        broker.setSalary(dto.getSalary());
        Broker save = brokerRepository.save(broker);
        BrokerDto brokerDto = modelMapper.map(save, BrokerDto.class);
        return brokerDto;
    }

    @Override
    public List<BrokerDto> getAllBroker() {

        List<Broker> all = brokerRepository.findAll();
        return all.stream()
                .map(broker -> modelMapper.map(broker, BrokerDto.class))
                .collect(Collectors.toList());

    }
}

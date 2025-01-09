package com.crm.crm.service;

import com.crm.crm.payload.BrokerDto;
import java.util.List;

public interface BrokerServiceInterface {

    public BrokerDto saveBroker(BrokerDto dto);

    public void deleteBroker(Long id);

    public BrokerDto updateBroker(Long id, BrokerDto dto);

    public List<BrokerDto> getAllBroker();


}

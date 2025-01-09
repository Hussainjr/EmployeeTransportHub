package com.crm.crm.service;

import com.crm.crm.payload.TransationDto;

import java.util.List;

public interface TranactionServiceInterface {

    public TransationDto saveTransation(TransationDto dto);

    public void deleteTransation(Long id);

    public TransationDto updateTransation(Long id, TransationDto dto);

    public List<TransationDto> getAllTransation();

}

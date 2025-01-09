package com.crm.crm.service;

import com.crm.crm.payload.StockDto;

import java.util.List;

public interface StockServiceInterface {

    public StockDto saveStock(StockDto dto);

    public void deleteStock(Long id);

    public StockDto updateStock(Long id, StockDto dto);

    public List<StockDto> getAllStock();

}

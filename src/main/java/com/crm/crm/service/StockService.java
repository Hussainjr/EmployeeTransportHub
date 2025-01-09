package com.crm.crm.service;

import com.crm.crm.entity.Stock;
import com.crm.crm.payload.StockDto;
import com.crm.crm.respository.StockRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockService implements StockServiceInterface{

    @Autowired
    private StockRepository stockRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public StockDto saveStock(StockDto dto) {
        Stock mapped = modelMapper.map(dto, Stock.class);
        Stock saved = stockRepository.save(mapped);
        StockDto stockDto = modelMapper.map(saved, StockDto.class);
        return stockDto;
    }

    @Override
    public void deleteStock(Long id) {
        stockRepository.deleteById(id);
    }

    @Override
    public StockDto updateStock(Long id, StockDto dto) {
        Optional<Stock> byId = stockRepository.findById(id);
        if(byId.isEmpty()){
            throw new RuntimeException("Stock with id "+id+" not found.");
        }
        Stock stock = byId.get();
        stock.setName(dto.getName());
        stock.setCode(dto.getCode());
        Stock saved = stockRepository.save(stock);
        StockDto stockDto = modelMapper.map(saved, StockDto.class);
        return stockDto;
    }

    @Override
    public List<StockDto> getAllStock() {
        List<Stock> all = stockRepository.findAll();
        List<StockDto> stockDtoList = all.stream().map(i -> modelMapper.map(i, StockDto.class)).toList();
        return stockDtoList;
    }
}

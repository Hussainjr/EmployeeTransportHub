package com.crm.crm.controller;

import com.crm.crm.payload.StockDto;
import com.crm.crm.service.StockService;
import org.aspectj.weaver.ResolvedPointcutDefinition;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/stockController")
public class StockController {

    @Autowired private StockService stockService;
    @Autowired private ModelMapper modelMapper;

    @PutMapping("/createStock")
    public ResponseEntity<?> createStock(@RequestBody StockDto stockDto){
        StockDto savedStock = stockService.saveStock(stockDto);
        return new ResponseEntity<>(savedStock, HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteStock(@RequestBody long id){
        stockService.deleteStock(id);
        return new ResponseEntity<>("stock deleted", HttpStatus.OK);
    }

    @PutMapping("/updateStock")
    public ResponseEntity<?> updateStock(@RequestParam long id, @RequestBody StockDto stockDto){
        StockDto updateStock = stockService.updateStock(id, stockDto);
        return new ResponseEntity<>(updateStock, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<StockDto>> getAllStocks(){
        List<StockDto> allStock = stockService.getAllStock();
        List<StockDto> stockDtoList = allStock.stream().map(i -> modelMapper.map(i, StockDto.class)).toList();
        return new ResponseEntity<>(stockDtoList, HttpStatus.OK);
    }


}

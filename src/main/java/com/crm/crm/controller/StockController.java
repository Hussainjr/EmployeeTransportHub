package com.crm.crm.controller;

import com.crm.crm.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StockController {

    @Autowired
    private StockService stockService;



}

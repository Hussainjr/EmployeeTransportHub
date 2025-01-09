package com.crm.crm.controller;

import com.crm.crm.payload.BrokerDto;
import com.crm.crm.service.BrockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Broker")
public class BrokerController {

    @Autowired
    private BrockerService brockerService;


        @PostMapping("/CreateBroker")
        public ResponseEntity<BrokerDto> CreateBroker(@RequestBody BrokerDto dto) {
            BrokerDto brokerDto = brockerService.saveBroker(dto);
            return new ResponseEntity<>(brokerDto, HttpStatus.CREATED);
        }

        @DeleteMapping
        public ResponseEntity<?> deleteBrokerById(Long id) {
            brockerService.deleteBroker(id);
            return new ResponseEntity<>("Deleted", HttpStatus.OK);
    }

        @PostMapping("/update")
        public ResponseEntity<BrokerDto> updateBrokerById(Long id, @RequestBody BrokerDto dto) {
            BrokerDto brokerDto = brockerService.updateBroker(id, dto);
            return new ResponseEntity<>(brokerDto, HttpStatus.OK);

        }

        @GetMapping("getAll")
        public ResponseEntity<List<BrokerDto>> getAll() {
            List<BrokerDto> allBroker = brockerService.getAllBroker();
            return new ResponseEntity<>(allBroker, HttpStatus.OK);

    }

}

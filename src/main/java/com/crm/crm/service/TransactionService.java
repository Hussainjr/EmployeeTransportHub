package com.crm.crm.service;

import com.crm.crm.entity.Transaction;
import com.crm.crm.payload.TransationDto;
import com.crm.crm.respository.TransactionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService implements TranactionServiceInterface {

    @Autowired
    private TransactionRepository transactionRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public TransationDto saveTransation(TransationDto dto) {
        Transaction mapped = modelMapper.map(dto, Transaction.class);
        Transaction saved = transactionRepository.save(mapped);
        TransationDto transationDto = modelMapper.map(saved, TransationDto.class);
        return transationDto;
    }

    @Override
    public void deleteTransation(Long id) {
        transactionRepository.deleteById(id);
    }

    @Override
    public TransationDto updateTransation(Long id, TransationDto dto) {
        Optional<Transaction> byId = transactionRepository.findById(id);
        if(byId.isEmpty()){
            throw new RuntimeException("Transation is not found by this id "+id);
        }
        Transaction transaction = byId.get();
        transaction.setCreateTime(dto.getCreateTime());
        transaction.setType(dto.getType());
        transaction.setExceutionTime(dto.getExceutionTime());
        transaction.setCancellationTime(dto.getCancellationTime());
        Transaction saved = transactionRepository.save(transaction);
        TransationDto transationDto = modelMapper.map(saved, TransationDto.class);
        return transationDto;
    }

    @Override
    public List<TransationDto> getAllTransation() {
        List<Transaction> all = transactionRepository.findAll();
        return all.stream().map(i->modelMapper.map(i, TransationDto.class)).toList();
    }
}

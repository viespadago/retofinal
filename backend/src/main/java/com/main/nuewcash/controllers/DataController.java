/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.nuewcash.controllers;

import com.main.nuewcash.entities.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.main.nuewcash.repositories.DataRepository;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author frank
 */
@RestController
public class DataController {

    private final DataRepository dataRepository;

    public DataController(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @GetMapping("/data")
    List<Data> allData() {
        return dataRepository.findAll();
    }

    @PostMapping("/data")
    Data newData(@RequestBody Data newData) {
        return dataRepository.save(newData);
    }

    @DeleteMapping("/data/{id}")
    void deleteData(@PathVariable String id) {
        dataRepository.deleteById(id);
    }

    @PutMapping("/data/{id}")
    Data updateData(@RequestBody Data newData, @PathVariable String id) {
        return dataRepository.findById(id)
                .map(data -> {
                    data.setName(newData.getName());
                    data.setMonth(newData.getMonth());
                    data.setTotalUsers(newData.getTotalUsers());
                    data.setTotalNewUsers(newData.getTotalNewUsers());
                    data.setTotalUniqueUsers(newData.getTotalUniqueUsers());
                    data.setTotalRequestedMoney(newData.getTotalRequestedMoney());
                    data.setAcceptedRequestPaid(newData.getAcceptedRequestPaid());
                    data.setAcceptedRequestUnpaid(newData.getAcceptedRequestUnpaid());
                    data.setLoanReturnTime(newData.getLoanReturnTime());
                    data.setRealBudget(newData.getRealBudget());
                    data.setPredictedBudget(newData.getPredictedBudget());
                    return dataRepository.save(data);
                })
                .orElseGet(() -> {
                    newData.setMonth(id);
                    return dataRepository.save(newData);
                });
    }
}

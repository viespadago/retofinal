/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.nuewcash.controllers;

import com.main.nuewcash.entities.Data;
import com.main.nuewcash.entities.RequestedMoney;
import com.main.nuewcash.repositories.DataRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author frank
 */
@RestController
public class ChartController {
    
    private final DataRepository dataRepository;

    public ChartController(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }
    
    
    
    @GetMapping("/total-money-users")
    List<RequestedMoney> requestedMoneyUsers() {
        List<RequestedMoney> listRequestMoney = new ArrayList<>();
        List<Data> datos =  dataRepository.findAll();
        for(Data dato : datos){
            String ano = dato.getMonth().substring(3);
            String mes = dato.getMonth().substring(0,2);
            Double cantidad = dato.getTotalRequestedMoney();
            Integer user = dato.getTotalUsers();
            listRequestMoney.add(new RequestedMoney(ano,mes,cantidad,user));
        }
        return listRequestMoney;
    }
}

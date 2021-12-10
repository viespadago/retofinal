/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.nuewcash.controllers;

import com.main.nuewcash.entities.Data;
import com.main.nuewcash.entities.DataMes;
import com.main.nuewcash.entities.DataTotal;
import com.main.nuewcash.repositories.DataRepository;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author frank
 */
@RestController
@CrossOrigin(origins = "*", methods ={RequestMethod.GET, RequestMethod.POST})
public class ChartController {

    private final DataRepository dataRepository;

    public ChartController(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @GetMapping("/total-money-users")
    List<DataTotal> requestedMoneyUsers() {
        List<DataTotal> listRequestMoney = new ArrayList<>();
        List<Data> datos = dataRepository.findAll();
        if (!datos.isEmpty()) {
            for (Data dato : datos) {
                String ano = dato.getMonth().substring(3);
                String mes = dato.getMonth().substring(0, 2);
                Double cantidad = dato.getTotalRequestedMoney();
                Integer user = dato.getTotalUsers();
                listRequestMoney.add(new DataTotal(ano, mes, cantidad, user));
            }
            return listRequestMoney;
        }
        return null;
    }

    @GetMapping("/data/{mes}")
    DataMes requestedMoneyUsers(@PathVariable String mes) {
        Data datos = dataRepository.getById(mes);
        if (datos != null) {
            String id = datos.getMonth();
            Integer acceptedRequests = datos.getAcceptedRequestPaid() + datos.getAcceptedRequestUnpaid();
            LocalTime loanReturnTime = datos.getLoanReturnTime();
            Double budget = datos.getPredictedBudget();
            return new DataMes(id, acceptedRequests, loanReturnTime, budget);
        }
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.nuewcash.entities;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author frank
 */
public class DataMes {
    private String mes;
    
    private Integer acceptedRequests;
    
    private LocalTime loanReturnTime;
    
    private Double budget;

    public DataMes() {
    }

    public DataMes(String mes, Integer acceptedRequests, LocalTime loanReturnTime, Double budget) {
        this.mes = mes;
        this.acceptedRequests = acceptedRequests;
        this.loanReturnTime = loanReturnTime;
        this.budget = budget;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Integer getAcceptedRequests() {
        return acceptedRequests;
    }

    public void setAcceptedRequests(Integer acceptedRequests) {
        this.acceptedRequests = acceptedRequests;
    }

    public LocalTime getLoanReturnTime() {
        return loanReturnTime;
    }

    public void setLoanReturnTime(LocalTime loanReturnTime) {
        this.loanReturnTime = loanReturnTime;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }
    
}

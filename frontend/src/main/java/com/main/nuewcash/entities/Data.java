/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.nuewcash.entities;

import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author frank
 */
@Entity
public class Data {
    
    @Id
    @Column(name="name")
    private String name;
    
    @Column(name="nameuuid")
    private String month;
    
    @Column(name="total_users")
    private Integer totalUsers;
    
    @Column(name="total_new_users")
    private Integer totalNewUsers;
    
    @Column(name="total_unique_users")
    private Integer totalUniqueUsers;
    
    @Column(name="total_requested_money")
    private Double totalRequestedMoney;
    
    @Column(name="accepted_requests_paid")
    private Integer acceptedRequestPaid;
    
    @Column(name="accepted_requests_unpaid")
    private Integer acceptedRequestUnpaid;
    
    @Column(name="loan_return_time")
    private LocalTime loanReturnTime;
    
    @Column(name="real_budget")
    private Double realBudget;
    
    @Column(name="predicted_budget")
    private Double predictedBudget;

    public Data(String name, String month, Integer totalUsers, Integer totalNewUsers, Integer totalUniqueUsers, Double totalRequestedMoney, Integer acceptedRequestPaid, Integer acceptedRequestUnpaid, LocalTime loanReturnTime, Double realBudget, Double predictedBudget) {
        this.name = name;
        this.month = month;
        this.totalUsers = totalUsers;
        this.totalNewUsers = totalNewUsers;
        this.totalUniqueUsers = totalUniqueUsers;
        this.totalRequestedMoney = totalRequestedMoney;
        this.acceptedRequestPaid = acceptedRequestPaid;
        this.acceptedRequestUnpaid = acceptedRequestUnpaid;
        this.loanReturnTime = loanReturnTime;
        this.realBudget = realBudget;
        this.predictedBudget = predictedBudget;
    }

    public Data() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Integer getTotalUsers() {
        return totalUsers;
    }

    public void setTotalUsers(Integer totalUsers) {
        this.totalUsers = totalUsers;
    }

    public Integer getTotalNewUsers() {
        return totalNewUsers;
    }

    public void setTotalNewUsers(Integer totalNewUsers) {
        this.totalNewUsers = totalNewUsers;
    }

    public Integer getTotalUniqueUsers() {
        return totalUniqueUsers;
    }

    public void setTotalUniqueUsers(Integer totalUniqueUsers) {
        this.totalUniqueUsers = totalUniqueUsers;
    }

    public Double getTotalRequestedMoney() {
        return totalRequestedMoney;
    }

    public void setTotalRequestedMoney(Double totalRequestedMoney) {
        this.totalRequestedMoney = totalRequestedMoney;
    }

    public Integer getAcceptedRequestPaid() {
        return acceptedRequestPaid;
    }

    public void setAcceptedRequestPaid(Integer acceptedRequestPaid) {
        this.acceptedRequestPaid = acceptedRequestPaid;
    }

    public Integer getAcceptedRequestUnpaid() {
        return acceptedRequestUnpaid;
    }

    public void setAcceptedRequestUnpaid(Integer acceptedRequestUnpaid) {
        this.acceptedRequestUnpaid = acceptedRequestUnpaid;
    }

    public LocalTime getLoanReturnTime() {
        return loanReturnTime;
    }

    public void setLoanReturnTime(LocalTime loanReturnTime) {
        this.loanReturnTime = loanReturnTime;
    }

    public Double getRealBudget() {
        return realBudget;
    }

    public void setRealBudget(Double realBudget) {
        this.realBudget = realBudget;
    }

    public Double getPredictedBudget() {
        return predictedBudget;
    }

    public void setPredictedBudget(Double predictedBudget) {
        this.predictedBudget = predictedBudget;
    }
    
    
}

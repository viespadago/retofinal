/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.nuewcash.entities;

/**
 *
 * @author frank
 */
public class DataTotal {
    
    private String ano;
    
    private String mes;
    
    private Double cantidad;
    
    private Integer users;

    public DataTotal(String ano, String mes, Double cantidad, Integer users) {
        this.ano = ano;
        this.mes = mes;
        this.cantidad = cantidad;
        this.users = users;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getUsers() {
        return users;
    }

    public void setUsers(Integer users) {
        this.users = users;
    }
    
}

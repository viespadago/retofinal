/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.nuewcash.repositories;

import com.main.nuewcash.entities.Data;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author frank
 */
public interface DataRepository  extends JpaRepository<Data, String>{
    
}

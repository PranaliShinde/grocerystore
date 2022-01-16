package com.spring.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springrest.entities.Beverages;

public interface BeverageDao extends JpaRepository<Beverages,Integer> {

}

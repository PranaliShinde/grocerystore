package com.spring.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springrest.entities.Vegetables;

public interface VegetableDao extends JpaRepository<Vegetables,Integer> {

}

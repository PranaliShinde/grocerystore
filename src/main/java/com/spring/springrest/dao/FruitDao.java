package com.spring.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springrest.entities.Fruits;

public interface FruitDao extends JpaRepository<Fruits,Integer> {

	
	
}

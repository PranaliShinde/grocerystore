package com.spring.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springrest.entities.Nonvegs;

public interface NonvegDao  extends JpaRepository<Nonvegs,Integer> {

}

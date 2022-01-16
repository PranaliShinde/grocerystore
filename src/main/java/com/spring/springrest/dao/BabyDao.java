package com.spring.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springrest.entities.Babys;

public interface BabyDao extends JpaRepository<Babys,Integer> {

}

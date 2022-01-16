package com.spring.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springrest.entities.Beautys;
import com.spring.springrest.entities.Beverages;

public interface BeautyDao extends JpaRepository<Beautys,Integer>{

}

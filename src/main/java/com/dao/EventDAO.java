package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Event;

public interface EventDAO extends JpaRepository<Event,Integer>{
	
}
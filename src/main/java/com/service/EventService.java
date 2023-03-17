package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.EventDAO;
import com.model.Event;

@Component("ds")
public class EventService {
	@Autowired 
	private EventDAO eventDAO;
	
	public EventDAO getEventDAO() {
		return eventDAO;
	}

	public void setEventDAO(EventDAO eventDAO) {
		this.eventDAO = eventDAO;
	}

	public void addEvent(Event event) {
		eventDAO.save(event);
	}
	
	public List<Event> getAllEvents() {
		return eventDAO.findAll();
	}
}

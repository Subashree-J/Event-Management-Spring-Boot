package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.dao.EventDAO;

@SpringBootApplication(exclude=HibernateJpaAutoConfiguration.class)
@ComponentScan(basePackages= {"mycom"})
@EnableJpaRepositories(basePackageClasses = EventDAO.class)
public class EventManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventManagementApplication.class, args);
	}

}

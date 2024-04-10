package com.spring.persona;

import com.spring.persona.entities.Persona;
import com.spring.persona.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PersonaSpringbootApplication {

	@Autowired
	public  PersonaRepository personaRepository;
	public static void main(String[] args) {
		SpringApplication.run(PersonaSpringbootApplication.class, args);
	}


}

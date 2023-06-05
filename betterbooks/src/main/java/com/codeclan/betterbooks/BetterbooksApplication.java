package com.codeclan.betterbooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class BetterbooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(BetterbooksApplication.class, args);
	}

}

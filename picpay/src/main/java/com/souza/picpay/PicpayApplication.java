package com.souza.picpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.souza.picpay.domain"})
@ComponentScan(basePackages = {"com.souza.picpay.controller", "com.souza.picpay.domain", "com.souza.picpay.service", "com.souza.picpay.data"})
@EnableJpaRepositories(basePackages = {"com.souza.picpay.data"})
public class PicpayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicpayApplication.class, args);
	}

}

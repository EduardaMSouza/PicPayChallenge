package com.souza.picpay;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EntityScan(basePackages = {"com.souza.picpay.domain"})
@ComponentScan(basePackages = {"com.souza.picpay.controller", "com.souza.picpay.domain", "com.souza.picpay.service", "com.souza.picpay.data", "com.souza.picpay.infra.security"})
@EnableJpaRepositories(basePackages = {"com.souza.picpay.data"})
public class PicpayApplication {

	@Bean
	public static ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Bean
	public static WebClient webClient() {
		return WebClient.builder().build();
	}

	public static void main(String[] args) {
		SpringApplication.run(PicpayApplication.class, args);
	}

}

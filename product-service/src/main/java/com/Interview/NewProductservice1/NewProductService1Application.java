package com.Interview.NewProductservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class NewProductService1Application {

	public static void main(String[] args) {
		SpringApplication.run(NewProductService1Application.class, args);
	}

}

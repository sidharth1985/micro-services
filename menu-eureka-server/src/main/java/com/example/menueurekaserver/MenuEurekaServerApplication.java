package com.example.menueurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MenuEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MenuEurekaServerApplication.class, args);
	}
}

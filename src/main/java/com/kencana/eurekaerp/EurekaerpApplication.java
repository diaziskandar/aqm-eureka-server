package com.kencana.eurekaerp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaerpApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaerpApplication.class, args);
	}

}

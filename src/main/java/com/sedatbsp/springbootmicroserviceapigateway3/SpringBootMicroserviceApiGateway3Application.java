package com.sedatbsp.springbootmicroserviceapigateway3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringBootMicroserviceApiGateway3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceApiGateway3Application.class, args);
	}

}

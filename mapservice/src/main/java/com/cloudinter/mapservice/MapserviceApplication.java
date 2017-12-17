package com.cloudinter.mapservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MapserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapserviceApplication.class, args);
	}
}

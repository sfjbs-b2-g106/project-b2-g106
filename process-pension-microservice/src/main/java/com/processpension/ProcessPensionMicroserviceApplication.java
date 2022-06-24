package com.processpension;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.processpension","com.processpension.entity"})
public class ProcessPensionMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessPensionMicroserviceApplication.class, args);
	}

}

package com.apis.management;

import com.apis.management.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApisManagementSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApisManagementSystemApplication.class, args);
	}
}
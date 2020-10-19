package com.course.cursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EntityScan({"com.course.entity"})
@SpringBootApplication
public class BackendMicroservicesCursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendMicroservicesCursoApplication.class, args);
	}

}

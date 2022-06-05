package com.init.almacen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



@EnableWebMvc
@SpringBootApplication

public class ApiAlmacenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiAlmacenApplication.class, args);
	}

}

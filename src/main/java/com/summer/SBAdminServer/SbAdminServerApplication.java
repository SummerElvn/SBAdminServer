package com.summer.SBAdminServer;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SbAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbAdminServerApplication.class, args);
	}

}

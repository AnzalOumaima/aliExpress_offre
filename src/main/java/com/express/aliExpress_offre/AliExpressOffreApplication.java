package com.express.aliExpress_offre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.express.aliExpress_offre.rest")
public class AliExpressOffreApplication {

	public static void main(String[] args) {
		SpringApplication.run(AliExpressOffreApplication.class, args);
	}

}


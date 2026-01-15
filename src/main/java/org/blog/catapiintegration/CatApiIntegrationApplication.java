package org.blog.catapiintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "org.ivanov.catapiintegration.api")
public class CatApiIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatApiIntegrationApplication.class, args);
	}

}

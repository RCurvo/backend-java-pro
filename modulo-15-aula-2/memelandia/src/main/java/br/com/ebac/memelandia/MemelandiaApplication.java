package br.com.ebac.memelandia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableFeignClients(basePackages = "br.com.ebac.memelandia.feign")
public class MemelandiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemelandiaApplication.class, args);
	}

}

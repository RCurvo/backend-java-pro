package br.com.rcurvo.memecategory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("br.com.rcurvo.memecategory.repositories")
public class MemecategoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemecategoryApplication.class, args);
	}

}

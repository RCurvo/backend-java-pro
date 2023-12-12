package br.com.rcurvo.memes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("br.com.rcurvo.memes.repositories")
public class MemesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemesApplication.class, args);
	}

}

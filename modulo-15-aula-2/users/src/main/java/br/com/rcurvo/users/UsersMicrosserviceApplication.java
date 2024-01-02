package br.com.rcurvo.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("br.com.rcurvo.users.repositories")
public class UsersMicrosserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersMicrosserviceApplication.class, args);
	}

}

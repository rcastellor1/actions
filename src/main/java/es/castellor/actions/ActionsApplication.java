package es.castellor.actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableJdbcRepositories
public class ActionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActionsApplication.class, args);
	}

}

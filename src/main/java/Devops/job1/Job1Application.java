package Devops.job1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Job1Application {
	@GetMapping("/message")
	public String getMessage() {
	return "Welcome to RJIL team...!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(Job1Application.class, args);
	}

}

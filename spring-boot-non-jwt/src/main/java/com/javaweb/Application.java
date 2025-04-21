package com.javaweb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = {"com.javaweb", "service", "service.impl", "repository"})
public class Application {
public static void main(String[] args) {
	SpringApplication.run(Application.class, args);
}
}

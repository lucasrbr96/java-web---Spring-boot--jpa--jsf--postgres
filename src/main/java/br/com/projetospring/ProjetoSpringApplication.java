package br.com.projetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ProjetoSpringApplication extends SpringBootServletInitializer {
	
	protected SpringApplicationBuilder configure(org.springframework.boot.builder.SpringApplicationBuilder application) {
		return application.sources(ProjetoSpringApplication.class);
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringApplication.class, args);
	}
}

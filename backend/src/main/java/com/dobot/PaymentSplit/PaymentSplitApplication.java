package com.dobot.PaymentSplit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PaymentSplitApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentSplitApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				// registry.addMapping("/**").allowedOrigins("http://localhost:5174");
				registry.addMapping("/**").allowedOrigins("*");
			}
		};
	}

}

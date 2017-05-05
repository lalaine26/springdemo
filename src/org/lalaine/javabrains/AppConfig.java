package org.lalaine.javabrains;
import org.lalaine.javabrains.service.ShapeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public ShapeService circle(){
		return new Circle();
	}
	@Bean
	public ShapeService triangle(){
		return new Triangle();
	}
}

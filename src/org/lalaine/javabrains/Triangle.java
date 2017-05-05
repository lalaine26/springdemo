package org.lalaine.javabrains;

import org.lalaine.javabrains.service.ShapeService;
import org.springframework.stereotype.Component;

@Component
public class Triangle implements ShapeService{
	
	public void draw(){
		System.out.println("Triangle is drawn");
	}

}

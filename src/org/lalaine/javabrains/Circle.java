package org.lalaine.javabrains;

import org.lalaine.javabrains.service.ShapeService;
import org.springframework.stereotype.Component;

@Component
public class Circle implements ShapeService{
	
	public void draw(){
		System.out.println("Circle is drawn");
	}

}

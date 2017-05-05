package org.lalaine.javabrains;

import java.awt.Shape;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lalaine.javabrains.service.ShapeService;
import org.omg.CORBA.TRANSACTION_ROLLEDBACK;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"spring.xml"})
public class DrawingApp {
	
	@Autowired
	@Qualifier(value = "triangle")
	private ShapeService circle;
	
	@Test
	public void dummyTest() {
		// TODO Auto-generated method stub
		circle.draw();
	}

}

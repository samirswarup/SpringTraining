package com.training;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.training.beans.GreetingService;

public class GreetingApp {

	public static void main(String[] args) {
		//BeanFactory factory= new XmlBeanFactory(new FileSystemResource("resources/applicationContext.xml"));
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		GreetingService gs1 = (GreetingService) factory.getBean("gs1");
		gs1.sayGreeting();
		
		GreetingService gs2 = (GreetingService) factory.getBean("gs2");
		gs2.sayGreeting();

	}

}

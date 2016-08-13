package com.spring.bean;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	static Logger log = Logger.getLogger(MainApp.class.getName());
	
	
	public static void main(String[] args) {
		
		
		 ApplicationContext context = new
		 ClassPathXmlApplicationContext("Beans.xml");
		
		 log.info("Going to create HelloWord Obj");
	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();
	      log.info("Exiting the program");

		// ApplicationContext context =
		// new ClassPathXmlApplicationContext("Beans.xml");
		// JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
		// jc.getAddressList();
		// jc.getAddressSet();
		// jc.getAddressMap();
		// jc.getAddressProp();

//		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//		context.start();
//		JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
//		jc.getAddressList();
//		jc.getAddressSet();
//		jc.getAddressMap();
//		jc.getAddressProp();
//		context.stop();
		
//		 ConfigurableApplicationContext context = 
//			      new ClassPathXmlApplicationContext("Beans.xml");    
//			      CustomEventPublisher cvp = 
//			      (CustomEventPublisher) context.getBean("customEventPushlisher");
//			      cvp.publisher();  
//			      //cvp.publisher();
		
//		ApplicationContext context = 
//	             new ClassPathXmlApplicationContext("Beans.xml");
//	      Student student = (Student) context.getBean("student");
//	      student.getName();
//	      student.getAge();      
//	      student.printThrowException();
	}
}

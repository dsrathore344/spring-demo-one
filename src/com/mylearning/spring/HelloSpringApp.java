


package com.mylearning.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		
		//load Spring configuration file
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 
		//retrieve beam from spring container 
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		//lets call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}
}

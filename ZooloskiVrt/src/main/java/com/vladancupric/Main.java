package com.vladancupric;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
		/*Animal bear = (Animal)context.getBean("bear");
		System.out.println(bear.toString());
		
		Animal wolf = (Animal) context.getBean("wolf");
		System.out.println(wolf.toString());
		
		Animal elephant = (Animal)context.getBean("elephant");
		System.out.println(elephant.toString());*/
		ZooloskiVrt zoo = (ZooloskiVrt)context.getBean("zoo");
		System.out.println(zoo);
		
		((FileSystemXmlApplicationContext) context).close();
		
		

	}

}

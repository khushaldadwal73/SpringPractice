package com.example.BeanswithGetterandSetter;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeansPracticeApplication {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("CollectionConfig.xml");
	        Collections collect= (Collections) context.getBean("cls");
				System.out.println(collect);
	}

}

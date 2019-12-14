package com.Practice.SpringDemo.ProgrammingLanguage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LanguageDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Language.xml");
		
		Language javalang = context.getBean("java", Language.class);
		Language clang = context.getBean("c", Language.class);

		System.out.println(javalang.getName() + "\n" + javalang.getType());
		System.out.println(clang.getName() + "\n" + clang.getType());
		context.close();
	}
}

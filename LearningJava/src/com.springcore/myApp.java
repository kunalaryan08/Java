// package com.springcore;

public class myApp {
  public static void main(String[] args) {
		System.out.println("Hello World!!");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student s1 = (Student)context.getBean("student1");
		Student s1 = (Student)context.getBean("student1");
		System.out.println(s1==s2);
	}
}

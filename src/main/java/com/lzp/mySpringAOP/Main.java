package com.lzp.mySpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new ClassPathXmlApplicationContext(
	                "spring-config2.xml");
	      /*  CutPointInterface cutPoint=    (CutPointInterface) context.getBean("cutPointClass");
	        cutPoint.method();*/
		 Loan loan= (Loan) context.getBean("loan");
		 Person p= (Person) context.getBean("person");
		 loan.transfer(p,1.0);
	}

}

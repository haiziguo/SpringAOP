package com.lzp.mySpringAOP;

public class WriterLogger implements Loan {
	@Override
	public void transfer(Person person, Double amount) {
		// TODO Auto-generated method stub
		 System.out.println(person.getName()+"即将转账金额为"+amount);
	}
}
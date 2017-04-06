package com.lzp.mySpringAOP;

public class TestLoan implements Loan {

    @Override
    public void transfer(Person person,Double amount) {
    	System.out.println("转账完成");
    } 
}

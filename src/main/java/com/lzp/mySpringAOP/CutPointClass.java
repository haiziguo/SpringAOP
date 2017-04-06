package com.lzp.mySpringAOP;

import org.springframework.stereotype.Component;

@Component
public class CutPointClass implements CutPointInterface {

    @Override
    public void method() {
        // TODO Auto-generated method stub
        System.out.println("切点类");
    }

}
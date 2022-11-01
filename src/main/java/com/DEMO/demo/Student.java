package com.DEMO.demo;

import org.springframework.stereotype.Service;

@Service
public class Student {

    public String yourBalance(){
        return "hello Casper your balance is";

    }

    public  int total() {
        return 1024+2017;
    }
}

package org.ME.Learning;

import org.springframework.stereotype.Component;

@Component
public class Dev {

    Dev(){
        System.out.println("Dev Constructor");
    }


    public  void build(){
        System.out.println("Hello World");
    }

}

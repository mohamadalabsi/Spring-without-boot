package org.ME.Learning;

import org.springframework.stereotype.Component;

@Component
public class Dev {

             Dev(){

        System.out.println("Dev Constructor");
  }

//    constructor injection
    public Dev(int age) {
        this.age = age;
        System.out.println("Dev 1 Constructor");
    }

    private Laptop laptop;



//    age should be private but for practice we let it like this and also to access it from main class
//    int age ;  1

//    now make it right    2, 3  , setter injection
    private  int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }




    public  void build(){
        System.out.println("Hello World");
    }

}

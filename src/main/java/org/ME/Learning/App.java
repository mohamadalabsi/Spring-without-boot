package org.ME.Learning;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {


      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // this will create the container , as soon as the container created , it will look to the xml file and see the mentioned beans and create object for them
//        Dev dev =context.getBean(Dev.class);  or
        Dev dev =(Dev) context.getBean("dev"); // (Dev) to make sure it (getBeans) returns the Object type
//        dev.build();


//        dev.age=10;    1 look at dev class
//        System.out.println(dev.age);

//        dev.setAge(33);   2 , now it is private and assign the age var using normal setter
//        System.out.println(dev.getAge());


//        3  now the right way using spring , and assign the age var using spring
//         System.out.println(dev.getAge());


//        constructor injection
//        System.out.println(dev.getAge());



//        injection but for laptop , setter and constructor
//        dev.build();

//        Auto wiring
          dev.build();

    }
}

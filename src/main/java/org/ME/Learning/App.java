package org.ME.Learning;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {


      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // this will create the container , as soon as the container created , it will look to the xml file and see the mentioned beans and create object for them
//        Dev dev =context.getBean(Dev.class);  or
//        Dev dev =(Dev) context.getBean("dev"); // (Dev) to make sure it (getBeans) returns the Object type
//        dev.build();



    }
}

package com.flybird.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "SpringBeans.xml");

        Helloworld obj = (Helloworld) context.getBean("helloBean");
        obj.printHello();
    }
}
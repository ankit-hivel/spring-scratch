package com.ankit;

import com.ankit.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /* XML based config */
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
//        System.out.println( "Hello World!" );
//        Programmer pg1 = (Programmer) ctx.getBean("programmer");
//        pg1.code();
//
//        Programmer pg2 = (Programmer) ctx.getBean("programmer");
//        pg2.code();

        /* Java based config */
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Programmer pg1 = (Programmer) context.getBean("programmer");
        pg1.code();

        Laptop l1 = (Laptop) context.getBean("lap1");
        l1.compile();
    }
}

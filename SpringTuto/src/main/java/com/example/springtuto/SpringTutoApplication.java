package com.example.springtuto;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringTutoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTutoApplication.class, args);

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Car obj = (Car)context.getBean("car");
        obj.drive();

//        Tyre t = (Tyre)context.getBean("tyre");
//        System.out.println(t);

    }

}

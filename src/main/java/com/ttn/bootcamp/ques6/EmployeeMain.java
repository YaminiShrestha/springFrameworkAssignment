package com.ttn.bootcamp.ques6;
/**
 * Perform Constructor Injection in a Spring Bean
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

    public static void main(String[] args) {

        ApplicationContext pathResource = new ClassPathXmlApplicationContext("beanQues6.xml");
        Employee employee = (Employee) pathResource.getBean("e");
        employee.display();


    }
}

package com.ttn.bootcamp.Ques5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {
    public static void main(String[] args) {

        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = ac.getBean(Employee.class);
        System.out.println(employee);
    }

}



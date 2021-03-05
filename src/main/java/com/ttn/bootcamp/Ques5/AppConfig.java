package com.ttn.bootcamp.Ques5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
    @Bean
    @Primary
    public Employee getEmployee1() {
        System.out.println("Employee 1");
        Employee employee = new Employee();
        employee.setName("Ram");
        employee.setDesignation("Developer");
        employee.setCountry("India");
        return employee;

    }

    @Bean
    public Employee getEmployee2() {
        System.out.println("Employee 2");
        Employee employee = new Employee();
        employee.setName("Alex");
        employee.setDesignation("Developer");
        employee.setCountry("London");
        return employee;

    }

}

package com.ttn.bootcamp.springAssignment;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAssignmentApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Polygon polygon = (Polygon) applicationContext.getBean("Polygon");
        polygon.getiPolygon().getArea();
        System.out.println(" Get a Spring Bean from application context and display its properties.");
       System.out.println( applicationContext.getBean(Polygon.class));

    }

}

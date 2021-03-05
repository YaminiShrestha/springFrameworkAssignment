package com.ttn.bootcamp.springAssignment;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Circle implements IPolygon {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    /*
     * This method get the area of circle
     * @param radius main input of the radius of circle
     * @return the area of circle
     */
    @Override
    public void getArea() {
        System.out.println(3.14 * radius * radius);

    }
}

package com.ttn.bootcamp.springAssignment;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Circle implements IPolygon {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    // This method get the area of circle
    @Override
    public void getArea() {
        System.out.println("Area of circle is " + 3.14 * radius * radius);

    }
}

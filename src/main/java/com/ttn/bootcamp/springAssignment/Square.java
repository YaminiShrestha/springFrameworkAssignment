package com.ttn.bootcamp.springAssignment;


import org.springframework.stereotype.Component;

@Component
public class Square implements IPolygon {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    //This method give the area of square
    @Override
    public void getArea() {
        System.out.println("Area of square is " + side * side);
    }


}

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
    /*
     * This method give the area of square
     * @param side main input of the side of square
     * @return area of the square
     */
    @Override
    public void getArea() {
       System.out.println(side * side);
    }


}

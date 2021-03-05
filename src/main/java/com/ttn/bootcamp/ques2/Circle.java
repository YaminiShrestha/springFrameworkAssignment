package com.ttn.bootcamp.ques2;


public class Circle implements IPolygon {
    /*
     * This method get the area of circle
     * @param radius main input of the radius of circle
     * @return the area of circle
     */
    @Override
    public double getArea(double radius) {
        return 3.14 * radius * radius;

    }
}

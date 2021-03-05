package com.ttn.bootcamp.ques1;

public class Polygon {
    /*
     * this method calculate the area of given polygon
     * @param number main input for calculating area
     * @return area of the specified polygon
     */
    public double calculate(double number) {
//       tight coupling
        Circle circle = new Circle();
        double area = circle.getArea(number);
        return area;
    }
}

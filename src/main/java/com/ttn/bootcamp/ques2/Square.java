package com.ttn.bootcamp.ques2;

public class Square implements IPolygon {
    /*
     * This method give the area of square
     * @param side main input of the side of square
     * @return area of the square
     */
    @Override
    public double getArea(double side) {
        return side * side;
    }
}

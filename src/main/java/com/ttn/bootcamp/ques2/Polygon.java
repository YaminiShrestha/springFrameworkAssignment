package com.ttn.bootcamp.ques2;


public class Polygon {
    // Reference of an interface
    private IPolygon iPolygon;

    // constructor
    public Polygon(IPolygon iPolygon) {
        this.iPolygon = iPolygon;
    }

    /*
     * this method calculate the area of given polygon
     * @param number main input for calculating area
     * @return area of the specified polygon
     */
    public double calculateArea(double number) {
        double area = iPolygon.getArea(number);
        System.out.println(iPolygon);
        return area;
    }


}

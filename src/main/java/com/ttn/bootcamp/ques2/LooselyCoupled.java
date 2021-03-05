package com.ttn.bootcamp.ques2;

/**
 * Write a program to demonstrate Loosely Coupled code.
 */

public class LooselyCoupled {
    public static void main(String[] args) {

        Polygon polygon = new Polygon(new Square());
        double result = polygon.calculateArea(5);
        System.out.println("Area is " + result);

    }

}

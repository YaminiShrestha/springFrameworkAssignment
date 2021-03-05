package com.ttn.bootcamp.ques1;

/**
 * Write a program to demonstrate Tightly Coupled code.
 */


public class TightlyCoupled {

    public static void main(String[] args) {

        Polygon polygon = new Polygon();
        double result = polygon.calculate(6);
        System.out.println(result);

    }
}

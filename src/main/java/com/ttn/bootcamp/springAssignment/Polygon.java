package com.ttn.bootcamp.springAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Polygon {
    // Reference of an interface
    @Autowired
    private IPolygon iPolygon;

    public IPolygon getiPolygon() {
        return iPolygon;
    }

    public void setiPolygon(IPolygon iPolygon) {
        this.iPolygon = iPolygon;
    }

    /*
     * this method calculate the area of given polygon
     * @param number main input for calculating area
     * @return area of the specified polygon
     */
    public void calculateArea() {
         iPolygon.getArea();

    }



}

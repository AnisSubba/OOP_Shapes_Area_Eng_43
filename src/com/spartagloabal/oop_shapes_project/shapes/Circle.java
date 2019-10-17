package com.spartagloabal.oop_shapes_project.shapes;

import com.spartagloabal.oop_shapes_project.Shapes;

import java.sql.SQLOutput;

public class Circle extends Shapes {

    private double areaOfCircle;
    private double circumferenceOfCircle;
    private double radius;
    private int side;
    private String colour;

    public Circle(String setColor, int numOfSide, double radius) {
        super(setColor, numOfSide);
        this.side = numOfSide;
        this.radius = radius;
        this.colour = setColor;
    }

    public void fullDetailOfCircle(){
        areaOfCircle = Math.PI * radius *radius;
        circumferenceOfCircle = 2 * Math.PI * radius;
        System.out.println("Radius: "+ radius);
        System.out.println("Amount of side in Circle: " + side);
        System.out.println("Area of Circle: " + areaOfCircle );
        System.out.println("Circumference of Circle: " + circumferenceOfCircle);
        System.out.println("Colour of Circle: " + colour);
        System.out.println();
    }

//    public double[] circleInfo(double radius){
//        double[] areaOfCircle;
//        areaOfCircle = new  [Math.PI * radius * radius];
//        circumferenceOfCircle =  2 * Math.PI * radius;
//        sideOfCircle = 1;
//        return new circleInfo(areaOfCircle, circumferenceOfCircle, sideOfCircle);

//    }
//
//    public double area(double radius){
//
//        return areaOfCircle = Math.PI * radius * radius;
//    }
//    public double circumferences (double radius){
//
//        return circumferenceOfCircle = 2 * Math.PI * radius;
//    }


}

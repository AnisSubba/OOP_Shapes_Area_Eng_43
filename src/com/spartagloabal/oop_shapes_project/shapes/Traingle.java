package com.spartagloabal.oop_shapes_project.shapes;

import com.spartagloabal.oop_shapes_project.Shapes;

public class Traingle extends Shapes {

    private String color;
    private int side;
    private double base;
    private double height;

    public Traingle(String setColor, int numOfSide, double setBase, double setHeight) {
        super(setColor, numOfSide);
        this.base = setBase;
        this.height = setHeight;
        this.side = numOfSide;
        this.color = setColor;
    }

    public void InfoOfTraingle(){
        double area = height * base / 2;
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Side of Triangle: " + side);
        System.out.println("Area of Triangle: " + area);
        System.out.println("Colour of Triangle: " + color);
        System.out.println();
    }
}

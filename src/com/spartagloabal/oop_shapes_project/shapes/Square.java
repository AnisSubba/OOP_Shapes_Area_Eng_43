package com.spartagloabal.oop_shapes_project.shapes;

import com.spartagloabal.oop_shapes_project.Shapes;

public class Square extends Shapes{
    private String color;
    private int side;
    private double length;

    public Square(String setColor, int numOfSide, double setlength) {
        super(setColor, numOfSide);
        this.color = setColor;
        this.side = numOfSide;
        this.length = setlength;
    }

    public void areaOfSquare(){
        double area = length * 2;
        double perimeter = length * side;
        System.out.println("Length: " + length);
        System.out.println("Total side of Rectangle: " + side);
        System.out.println("Area of Square: " + area);
        System.out.println("Perimeter of Square: " + perimeter);
        System.out.println("Colour of Square: " + color);
        System.out.println();
    }
}

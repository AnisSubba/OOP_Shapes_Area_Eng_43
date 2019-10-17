package com.spartagloabal.oop_shapes_project.shapes;

import com.spartagloabal.oop_shapes_project.Shapes;

public class Rectangle extends Shapes {

    private String color;
    private int side;
    private double length;
    private double width;

    public Rectangle(String setColor, int numOfSide, double setlength, double setwidth) {
        super(setColor, numOfSide);
        this.color = setColor;
        this.side = numOfSide;
        this.length = setlength;
        this.width = setwidth;
    }

    public void fullDetailOfRectangle(){
        double areaOfRec = length * width;
        double perimeterOfRec = 2 * (length + width);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Total side of Rectangle: " + side);
        System.out.println("Area of Rectangle: " + areaOfRec);
        System.out.println("Perimeter of Rectangle: " + perimeterOfRec);
        System.out.println("Color of Rectangle: " + color);
        System.out.println();

    }

}

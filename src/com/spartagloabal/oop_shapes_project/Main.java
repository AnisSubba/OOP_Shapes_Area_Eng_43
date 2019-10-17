package com.spartagloabal.oop_shapes_project;

import com.spartagloabal.oop_shapes_project.shapes.Circle;
import com.spartagloabal.oop_shapes_project.shapes.Rectangle;
import com.spartagloabal.oop_shapes_project.shapes.Square;
import com.spartagloabal.oop_shapes_project.shapes.Traingle;

public class Main {

    public static void main(String[] args) {

        Circle infoOfCircle = new Circle("red",1,2.1);
        Square infoOfSquare = new Square("green", 4, 2.5);
        Rectangle infoOfRectangle = new Rectangle("blue", 4, 5,2);
        Traingle infoOfTraingle = new Traingle("White", 3, 6.1,7.5);

        infoOfRectangle.fullDetailOfRectangle();
        infoOfCircle.fullDetailOfCircle();
        infoOfSquare.areaOfSquare();
        infoOfTraingle.InfoOfTraingle();

    }
}

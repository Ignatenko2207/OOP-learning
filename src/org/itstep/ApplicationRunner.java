package org.itstep;

import org.itstep.model.Circle;
import org.itstep.model.Shape;
import org.itstep.model.Triangle;
import org.itstep.model.Square;

import java.util.*;

public class ApplicationRunner {
    public static void main(String[] args) {
        Circle circle = new Circle(15);

        Triangle triangle = new Triangle(10, 8);

        Square square = new Square(18);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        shapeList.add(triangle);
        shapeList.add(square);
        shapeList.add(circle);

        System.out.println("Size of list is " + shapeList.size());

        Set<Shape> shapeSet = new HashSet<>();
        shapeSet.add(circle);
        shapeSet.add(triangle);
        shapeSet.add(square);
        shapeSet.add(circle);

        System.out.println("Size of set is " + shapeSet.size());

    }
}

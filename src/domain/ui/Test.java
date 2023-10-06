package domain.ui;

import domain.model.Circle;
import domain.model.Shape;
import domain.model.Square;
import domain.model.Rect;
import domain.model.Ellipse;

public class Test {
    public static void main(String[] args) {
        var shapes = new Shape[]{
        new Rect(10,20),
        new Circle(20),
        new Square(20),
        new Ellipse(5,10),
        new Square(10),
        };

        var sumArea=0;
        for(Shape s: shapes){
            sumArea=s.getArea();
        }
        var avgArea = sumArea / shapes.length;
        System.out.println("Área promedio: "+avgArea);
    }
}

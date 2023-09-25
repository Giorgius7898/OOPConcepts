package domain.ui;

import domain.model.Shape;
import domain.model.Square;
import domain.model.Rect;

public class Test {
    public static void main(String[] args) {
        var Square = new Square();
        Square.setWidth(65);
        System.out.println("Width: "+Square.getWidth());
        Square.setHeight(21);
        System.out.println("Height: "+Square.getHeight());
        System.out.println("El area es: "+Square.getArea());
        System.out.println("El perímetro es: "+Square.getPerimeter());
    }
}

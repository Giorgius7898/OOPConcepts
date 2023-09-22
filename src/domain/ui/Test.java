package domain.ui;

import domain.model.Shape;
import domain.model.Square;
import domain.model.Rect;

public class Test {
    public static void main(String[] args) {
        var Square = new Rect();
        Rect.setWidth(65);
        System.out.println("Width: "+Rect.getWidth());
        System.out.println("Height: "+Rect.getHeight());
        Rect.setHeight(21);
    }
}

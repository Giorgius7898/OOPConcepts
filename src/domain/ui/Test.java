package domain.ui;

import domain.model.Shape;
import domain.model.Square;
import domain.model.Rect;

public class Test {
    public static void main(String[] args) {
        var rect = new Rect();
        rect.setWidth(65);
        System.out.println("Width: "+rect.getWidth());
        System.out.println("Height: "+rect.getHeight());
        rect.setHeight(21);
        System.out.println("Width: "+rect.getWidth());
        System.out.println("Height: "+rect.getHeight());
    }
}

package domain.ui;

import domain.model.Shape;

public class Test {
    public static void main(String[] args) {
        var shape1 = new Shape(-200,10);
        var shape2 = new Shape(20,1500);

        System.out.println(shape1.getX());

    }
}

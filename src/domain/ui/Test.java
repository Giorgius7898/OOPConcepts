package domain.ui;

import domain.model.Shape;

public class Test {
    public static void main(String[] args) {
        var shape1 = new Shape(10,20);
        var shape2 = new Shape();
        System.out.println("Ins #1 x = "+shape1.x+ ", y = "+shape1.y);
        System.out.println("Ins #2 x = "+shape2.x+ ", y = "+shape2.y);

        System.out.println("Sum Ins#1 = "+shape1.getAdd());
        System.out.println("Sum Ins#2 = "+shape2.getAdd());
    }
}

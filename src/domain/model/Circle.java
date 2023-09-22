package domain.model;

public class Circle extends Shape{
    private int radius = 0;
    public int getRadius(){
        return radius;
    }
    public void setRadius(int newRadius){
        if (newRadius >= 0)
            radius = newRadius;
    }
    @Override
    public int getArea(){
        return pi*(getRadius());
    }
    @Override
    public int getPerimeter(){
        return 4*getWidth();
    }
}

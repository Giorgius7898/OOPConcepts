package domain.model;

public class Ellipse extends Circle{
    private int radius2 = 0;
    public int getRadius2(){

        return radius2;
    }
    public void setRadius2(int newRadius2){
        if (newRadius2 >= 0)
            radius2 = newRadius2;
    }
    @Override
    public int getArea(){
        return (int) (Math.PI*getRadius()*getRadius2());
    }
    @Override
    public int getPerimeter(){
        return (int) (2 * Math.PI * Math.sqrt((double) (getRadius() * getRadius() + getRadius2() * getRadius2()) / 2));

    }
    public Ellipse(int newX, int newY, int newRadius, int newRadius2){
        super(newX, newY, newRadius2);
        setRadius(newRadius2);
    }
    public Ellipse(int newRadius, int newRadius2){
        this(0,0,newRadius, newRadius2 );
    }
}

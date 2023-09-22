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
}

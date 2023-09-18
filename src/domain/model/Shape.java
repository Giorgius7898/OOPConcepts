package domain.model;

public class Shape {
    public int x = 0;
    public int y = 0;
    public Shape(int newX, int newY){
        x = newX;
        y = newY;
    }
    public Shape(){

    }
    public int getAdd(){
        return x+y;
    }
}


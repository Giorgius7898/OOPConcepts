package domain.model;

public class Square extends Shape{

    private int width = 0;


    public void setWidth(int newWidth){
        if (newWidth >= 0)
            width = newWidth;
    }
    public int getHeight(){
        return getWidth();
    }
    public void setHeight(int newHeight){
        setWidth(newHeight);
    }
    @Override
    public int getArea(){
        return getWidth()*getHeight();
    }
    @Override
    public int getPerimeter(){
        return 2*getWidth()+2*getHeight();
    }
    public int getWidth(){

        return  width;
    }
    public Square(int newX, int newY, int newWidth){
        super(newX, newY);
        setWidth(newWidth);
    }
    public Square(int newWidth){

        this(0,0,newWidth);
    }
}

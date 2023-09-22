package domain.model;

public class Rect extends Square{
    private int height = 0;
    @Override
    public int getHeight(){
        return height;
    }
    @Override
    public void setHeight(int newHeight){
        if (newHeight >= 0)
            height = newHeight;
    }
}

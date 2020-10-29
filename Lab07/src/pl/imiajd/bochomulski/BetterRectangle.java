package pl.imiajd.bochomulski;

public class BetterRectangle extends java.awt.Rectangle {

    public BetterRectangle(int width, int height) {
        super(0,0,width,height);
        //super.setLocation(0,0);
        //super.setSize(width, height);
    }

    public double getPerimeter(){
        return super.height * 2 + super.width * 2;
    }

    public double getArea(){
        return super.width * super.height;
    }
}

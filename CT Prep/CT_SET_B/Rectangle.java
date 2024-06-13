package CT_SET_B;

public class Rectangle extends Shape{
    private double length,width;
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double getArea(){
        return length*width;
    }
}

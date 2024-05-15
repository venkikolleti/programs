public class shape{

    public static void main(String[] args) {
        
    }
}

abstract class Shape{
    protected String color;
    protected boolean filled;

    public Shape(){
    }
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String  color){
        this.color=color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    abstract public double getArea();
    abstract public double getPerimeter();
    abstract public String toString();

}




class Circle extends Shape{
    protected double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius; 
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }
    public double getPerimeter(){
        return 2*3.14*radius;
    }
    public String toString(){
        return "this is circle";
    }
}


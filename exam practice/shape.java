abstract class Shape {
    double dim1;
    double dim2;
    final double pi=3.14;
    double Area;
    Shape(double dim1,double dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }
    abstract void area();
    public void ToString(){
        System.out.println(Area);
    }

}

class Circle extends Shape{
    Circle(double dim1,double dim2){
        super(dim1,dim2);
    }
    public void area(){
        Area=2*pi*(dim1*dim2);
    }

}

class Rectangle extends Shape{
    Rectangle(double dim1,double dim2){
        super(dim1,dim2);
    }
    public void area(){
        Area=2*(dim1+dim2);
    }
}

class Triangle extends Shape{
    Triangle(double dim1,double dim2){
        super(dim1,dim2);
    }
    public void area(){
        Area=0.5*(dim1*dim2);
    }
}


class Ellipse extends Shape{
    Ellipse(double dim1,double dim2){
        super(dim1,dim2);
    }
    public void area(){
        Area=pi*dim1*dim2;
    }

}






public class shape{
    public static void main(String args[]){
        Circle c=new Circle(23,30);
        c.area();
        c.ToString();

        Rectangle r=new Rectangle(23,5);
        r.area();
        r.ToString();


        Triangle t=new Triangle(13,15);
        t.area();
        t.ToString();


        Ellipse e=new Ellipse(17,15);
        e.area();
        e.ToString();
        
        
    }
}

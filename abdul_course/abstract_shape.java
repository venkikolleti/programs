abstract class shape{
    abstract public double perimeter();
    abstract public double area();
}

class circle extends shape{
    double radius;
    public double perimeter(){
        return 2*Math.PI*radius;
    }

    public double area(){
        return Math.PI*radius*radius;
    }
} 

class rectangle extends shape{
    double length,breadth;

    public double perimeter(){
        return 2*(length+breadth);
    }
    public double area(){
        return length*breadth;
    }

}

public class abstract_shape {
    public static void main(String args[]){

        circle c=new circle();
        c.radius=10;
        System.out.println(c.area());
        System.out.println(c.perimeter());


        System.out.println();

        rectangle r=new rectangle();
        r.length=10;
        r.breadth=20;

        System.out.println(r.area());
        System.out.println(r.perimeter());



    }
}

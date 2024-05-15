import java.util.*;
class circle{
    double radius;

    public double area(){
        return Math.PI*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}


public class circle_class {
    public static void main(String args[]){
        
        circle c=new circle();
        c.radius=10;
        System.out.println(c.area());
        System.out.println(c.perimeter());
        System.out.println(c.circumference());


    }
}

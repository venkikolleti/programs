
class parent{
    public parent(){
        System.out.println("this is the parent constructor");
    }
}

class child extends parent{
    public child(){
        System.out.println("this is the child constructor");
    }
}



class Circle{
    int length,breadth;
    public Circle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    Circle(){
        length=breadth=1;
        System.out.println("parent constructor");
    }
    public String toString(){
        return length+" "+breadth;
    }
}

class Cylinder extends Circle{
    int height;
    public Cylinder(int height){
        this.height=height;
    }
    public Cylinder(int length,int breadth,int height){
        super(length,breadth);
        this.height=height;
    }
    public Cylinder(){
        super();
        System.out.println("child constructor");
    }
    public String toString(){
        return length+" "+breadth+" "+height;
    }
}



public class inheritance_constructor {
    public static void main(String args[]){

        parent p=new parent();
        child c=new child();


        Circle ci=new Circle();

        //System.out.println(ci);

        Cylinder cy=new Cylinder();

        //System.out.println(cy);

        Cylinder cl=new Cylinder(10,20,30);
        System.out.println(cl);
    }
}

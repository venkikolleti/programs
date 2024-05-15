abstract class shape{
        String color;
        boolean filled;
        abstract void area();
        shape(String color,boolean filled){
            this.color=color;
            this.filled=filled;
        }
        abstract void display();
}

class Circle extends shape{
    Circle(String color,boolean filled){
        super(color,filled);
    }
    void area(){
        System.out.println("area of circle");
    }
    void display(){
        System.out.println(color+"\t"+filled);
    }
}


class shape_ab{
    public static void main(String args[]){
        Circle c=new Circle("red",true);
        c.area();
        c.display();
    }
}
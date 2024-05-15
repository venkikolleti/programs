class student{
    public student(){
        System.out.println("parent constructor");
    }
    public student(String name){
        System.out.println("student is "+name);
    }
}

class teacher extends student{
    public teacher(){
        System.out.println("teacher constructor");
    }
    public teacher(String name){
        System.out.println("teacher is "+name);
    }
    public teacher(String name,String nam){
        super(name);
        System.out.println("2 parameter "+nam);
    }
}

public class inheritance_constructor_1 {
    public static void main(String args[]){

        teacher t=new teacher();

        System.out.println();

        teacher t1=new teacher("raju");

        System.out.println();

        teacher t2=new teacher("ramuu","raghu");

    }
}

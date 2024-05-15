import java.util.Scanner;

public class method_overidding {
    public static void main(String[] args) {
        A obj=new A();
        A obj2=new B();
        A obj3=new C();

        // in the above all the class reference to class A and new objects are refered to the extended classess...
        // which method should call depend on the the object type not reference type

        // below i call the all the display methods through the reference variables....
        //

        obj.display();
        obj2.display();
        obj3.display();


    }
}

class A{
    void display(){
        System.out.println("this is class A");
    }
}


class B extends A{
    @Override
    void display(){
        System.out.println("this is class B");
    }
}



class C extends A{
    @Override
    void display(){
        System.out.println("this is class C");
    }
}

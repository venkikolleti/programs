
class A{
    void sum(){
        double a=10,b=20;
        double c=a+b;
        System.out.println("this is sum: "+c);
    }
    void sub(){
        double a=10,b=20;
        double c=a-b;
        System.out.println("this is sub: "+c);
    }
}

class B extends A{
    void mul(){
        double a=10,b=20;
        double c=a*b;
        System.out.println("this is mul: "+c);
    }

    void div(){
        double a=10,b=20;
        double c=a/b;
        System.out.println("this is division: "+c);
    }
}

class C extends B{
    void per(){
        double a=10,b=20;
        double c=a%b;
        System.out.println("this is remainder: "+c);
    }
}




public class inheritance_2 {
    public static void main(String args[]){

        C x=new C();
        x.sum();
        x.sub();
        x.mul();
        x.div();
        x.per();

    }
}

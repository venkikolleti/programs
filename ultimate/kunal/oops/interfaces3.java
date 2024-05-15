public class interfaces3 {
    public static void main(String[] args) {
        C c=new C();
        c.greet();
        c.fun();
        c.fun2();
    }
}

interface A{
    void fun();
    default void fun2(){
        System.out.println("this is the default method");
    }
}
interface B extends A{
    void greet();
    //void fun2();
}
class C implements B{

    @Override
    public void greet() {
        // TODO Auto-generated method stub
        System.out.println("this is the greet method");
    }

    @Override
    public void fun() {
        // TODO Auto-generated method stub
        System.out.println("this is the fun method");
    }
    public void fun2(){
        System.out.println("this is the fun2 method");
    }
    
}

abstract class parent{
    public parent(){
        System.out.println("parent constructor");
    }

    public void method1(){
        System.out.println("method1");
    }

    abstract public void method2();
}

class child extends parent{
    public void method2(){
        System.out.println("method2");
    }
}

public class abstract_1 {
    public static void main(String args[]){

        child c=new child();
        c.method1();
        c.method2();

        System.out.println();
        //System.out.println();

    
        parent p=new child();
        p.method1();   
        p.method2();     

    }
}

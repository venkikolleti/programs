class outside{
    void method1(){
        System.out.println("parent method1");
    }
    void method2(){
        System.out.println("parent method2");
    }
}


class inside extends outside{
    void method2(){
        System.out.println("sub method2");
    }    
    void method3(){
        System.out.println("sub method3");
    }
}

public class dynamic_method_dispatch {
    public static void main(String args[]){
        outside o=new inside();
        o.method1();
        o.method2();
        //(o)  object doesnot contain method 3 beacause it is refer from super class....
    }
}

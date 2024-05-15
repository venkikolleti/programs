interface test{
    void method1();
    void method2();
}

class sub implements test{
    public void method1(){
        System.out.println("method_1 sub");
    }
    public void method2(){
        System.out.println("method_2 sub");
    }
    void method3(){
        System.out.println("metyhod_3 sub");
    }
}

class test1 implements test{
    public void method1(){
        System.out.println("method_1 sub");
    }
    public void method2(){
        System.out.println("method_2 sub");
    }
}





public class interface_1{
    public static void main(String args[]){

        test t=new sub();
        t.method1();
        t.method2();

        System.out.println();

        sub s=new sub();
        s.method1();
        s.method2();
        s.method3();

        System.out.println();


        test1 t1=new test1();
        t1.method1();
        t1.method2();


    }
}

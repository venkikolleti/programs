class A{
    int a;
    static int x=10;
    static String n="rkv";

    static{
        x=100;
        n="nuziveedu";
    }
    void cge(){
        n="rguktrkvalley";
        x=1000;
        
    }
    void display(){
        System.out.println(n);
    }

}




public class static_1 {
    public static void main(String args[]){
        System.out.println(A.x);
        //System.out.println(A.x);
        System.out.println(A.n);
        //A.change();
        A obj=new A();
        //obj.display();
        obj.cge();
        System.out.println(A.n);
        //System.out.println(obj.a);


        
    }
}

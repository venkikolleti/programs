class test{
    static int x=10;
    int y=20;
    void show(){
        System.out.println(x+" "+y);
    }
    static void display(){
        System.out.println(x);
    }
}


public class static_mem_methods {
    public static void main(String args[]){

        test t1=new test();
        t1.show();
        t1.x=30;
        t1.y=50;
        t1.show();

        test t2=new test();
        t2.show();

        System.out.println(test.x);
        test.display();

    }
}

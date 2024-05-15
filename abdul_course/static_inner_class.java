class OUTER{
    static int x=10;
    int y=20;
    static void meth1(){
        System.out.println("method 1");
    }
    void meth2(){
        System.out.println("method 2");
    }

    static class inner{
        void display(){
            System.out.println(x);
            //System.out.println(y);
            meth1();
        }

    }
}




public class static_inner_class {
    public static void main(String args[]){

        OUTER.inner o=new OUTER.inner();
        o.display();

     
    }
}

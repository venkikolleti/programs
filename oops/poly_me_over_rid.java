class A{

    void show(){
        System.out.println("this is super class");
    }

}

class B extends A{
   
    void show(){
	super.show();
        System.out.println("this is sub class");
    }
}


public class poly_me_over_rid {
    public static void main(String args[]){
        A cla=new B();
        cla.show();

        A cl=new A();
        //cl.show();

        B n=new B();
        //n.show();
    }
}

interface A{
    void num();
}

class B implements A{
    public void num(){
        System.out.println("this is method1");
    }
}


public class interface_1 {
    public static void main(String args[]){
        System.out.println("this is interfaces");
        B b=new B();
        b.num();
    }

}

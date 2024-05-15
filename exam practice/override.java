class A{
    void sum(){
        System.out.println("this is normal method");
    }
    int sum(int a){
        return 40;
    }
}

public class override {
    public static void main(String args[]){
        A obj=new A();
        obj.sum();
    }
}

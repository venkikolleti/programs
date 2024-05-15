public class method_overloading {
    public static void main(String[] args) {
        A obj=new A();
        obj.sum(10,20);   
    }
}

class A{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    int sum(int a,int b,int c){
        return a+b;
    }
}
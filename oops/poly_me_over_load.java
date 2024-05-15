class A{
    void add(){
        int a=8,b=3;
        System.out.println(a+b);
    }

    void add(int x,int y){
        System.out.println(x+y);
    }
    void add(int x,double y){
        System.out.println(x+y);
    }
}


public class poly_me_over_load {
    public static void main(String args[]){
        A a=new A();
        a.add();
        a.add(34,87);
        a.add(45,67.3);
    }
}

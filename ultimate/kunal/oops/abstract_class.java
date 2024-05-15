public abstract class abstract_class{
    public static void main(String args[]){
        Abs2 obj=new Abs2("venki");
        obj.method1();
        obj.method2();
        obj.career();
        obj.partner();


    }
}



abstract class Abs{
    String name;
    final int AGE;
    public Abs(String name){
        this.name=name;
        AGE=10;

    }

    public void method1(){
        System.out.println("this is the method1");
    }
    public static void method2(){
        System.out.println("this is the method2");
    }

    abstract void career();
    abstract void partner();
}


class Abs2 extends Abs{
    public Abs2(String name){
        super(name);
    }

    void career(){
        System.out.println("this is your career");
    }
    void partner(){
        System.out.println("this is your partner");
    }
}
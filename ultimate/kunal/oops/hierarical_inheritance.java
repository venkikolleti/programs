//one classs extends by many other classes
public class hierarical_inheritance {
    public static void main(String[] args) {
        B obj=new B("venki", "kolleti@gmail.com");
        System.out.println(obj.name+" "+obj.email);

        C obj1=new C("rajuu","R190636");
        System.out.println(obj1.name+" "+obj1.roll);
        
    }
}


class A{
    String name;
    A(String name){
        this.name=name;
    }
}

class B extends A{
    String email;
    B(String name,String email){
        super(name);
        this.email=email;
    }
}

class C extends A{
    String roll;
    C(String name,String roll){
        super(name);
        this.roll=roll;
    }
}
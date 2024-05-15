public class multilevel_inheritance {
    public static void main(String[] args) {
        C obj=new C("venki","kolleti","R190636");
        System.out.println(obj.name+" "+obj.email+" "+obj.roll);
        obj.name();
        obj.email();
        obj.roll();
    }    
}

class A{
    String name;
    A(String name){
        this.name=name;
    }
    void name(){
        System.out.println(name);
    }
}

class B extends A{
    String email;
    B(String name,String email){
        super(name);
        this.email=email;
    }
    void email(){
        System.out.println(email);
    }
}
class C extends B{
    String roll;
    C(String name,String email,String roll){
        super(name,email);
        this.roll=roll;
    }
    void roll(){
        System.out.println(roll);
    }
}

public class interface4 {
    public static void main(String[] args) {
       B b=new B();
       b.display(); 
       A.display();
        //here the main thing is static things are not directly depends on object so that if we can
        //override this also there is no use of it because it can be directly access from the class or interface
        
       
    }
}


interface A{
    static void display(){
        System.out.println("this is the static method not allowed to overrride");
    }
    
}

class B implements A{
    void display(){
        System.out.println("this");
    }
}
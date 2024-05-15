public class nested_interface {
    public static void main(String[] args) {
      C c=new C();
      c.fun();  
    }
}

interface A{
    public interface B{
        void fun();
    }
}
class C implements A.B{

    @Override
    public void fun() {
        System.out.println("this is the fun method");
    }

}
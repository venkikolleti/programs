public class inner_static {
    static class inner{ //by making this class static ..... we call it without object of outer class.. 
        String name;    // if it is not static we cant access this class without object of outer class..
        inner(String name){
            this.name=name;
        }
    }

    class inner2{
        String name;
        inner2(String name){
            this.name=name;
        }
    }

    public static void main(String[] args) {

        inner obj=new inner("venki");
        System.out.println(obj.name);


        // how to call the non static class ...

        inner_static.inner2 obj2=new inner_static().new inner2("kolleti");

        System.out.println(obj2.name);

        // how to call static inner class by using the outer class
        inner_static.inner obj3=new inner_static.inner("rajuuu");
        System.out.println(obj3.name);

    }
}

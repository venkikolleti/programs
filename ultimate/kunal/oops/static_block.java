public class static_block {
    static int a=10;
    static int b;
    static{
        System.out.println("this is the static block");
        b=a*2;
    }
    public static void main(String[] args) {
        static_block obj=new static_block(); //this is first object so here the static block is going to execute
        System.out.println(obj.a+" "+obj.b);

        obj.b+=3;

        static_block obj1=new static_block(); //here for second object static block is not going to execute
        System.out.println(obj1.a+" "+obj1.b);
    }
}

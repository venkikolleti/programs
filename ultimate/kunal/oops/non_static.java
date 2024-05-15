public class non_static {
    public static void main(String[] args) {
        non_static n=new non_static();
        n.fun3();
    }

    void greeting(){
        System.out.println("hello world");
    }
    static void fun(){
        //greeting();//inside static... not-statics are not allowed without instances..

        non_static n=new non_static();      //this should be fine
        n.greeting();
    }
    void fun2(){
        fun();//non static allows static things directly
    }

    void fun3(){
        fun2(); // non static allows non statical things directly without instance
    }
}

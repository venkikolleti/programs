public class Static {
    public static void main(String[] args) {
        test.display2();
    }
}
class test{
    static{
        System.out.println(100);
        int m=90;
    }
    static int x=10;
    int y=20;
    void display(){
        System.out.println(x+" "+y);
    }
    static void display2(){
        System.out.println(x);
    }
}

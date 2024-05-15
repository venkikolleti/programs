public class try_catch_blocks {
    public static void main(String args[]){
        int a,b,c;
        try{
            a=10;
            b=0;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("division by zero "+e);
        }
        System.out.println("code completed");
        System.out.println(); 

    }
}

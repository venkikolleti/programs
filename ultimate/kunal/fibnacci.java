public class fibnacci {
    public static void main(String args[]){

        System.out.println(fib1(20));
        System.out.println("\n"+n1+"\n"+n2);

        fib(5);


    }
    static int n1=0,n2=1,n3=0;
    static void fib(int n){
        if(n>2){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
            fib(n-1);
        }
    }

    static int fib1(int n){
        if(n<2){
            return n;
        }

        return fib1(n-1)+fib1(n-2);

    }
}

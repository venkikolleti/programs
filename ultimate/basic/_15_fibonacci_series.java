import java.util.Scanner;

//fibonacci series.............

public class _15_fibonacci_series {
    static int c=0,d=1,next;
    static int fib(int n){
        if(n>2){
            next=c+d;
            c=d;
            d=next;
            System.out.print(next+" ");
            fib(n-1);
        }
        return 0;
    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a number:");
        int x=sc.nextInt();
        int a=0,b=1,next;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<x;i++){
            next=a+b;
            a=b;
            b=next;
            System.out.print(next+" ");
        }
        System.out.println();





        //recursion.........
        System.out.print(c+" "+d+" ");
        fib(x);
        System.out.println();




        // by using arrays..or calles formula method..........

        int arr[]=new int[x];
        arr[0]=0;
        arr[1]=1;
        System.out.print(arr[0]+" "+arr[1]+" ");
        for(int i=2;i<x;i++){
            arr[i]=arr[i-1]+arr[i-2];
            System.out.print(arr[i]+" ");
        }
        System.out.println();




    }
}

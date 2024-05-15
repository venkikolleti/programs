import java.util.Scanner;

//sum of first n natural numbers and sum of n natural numbers(make)...............

public class _3_sum_of_n_natural {

    static int calsum(int x){
        if(x==0)
            return x;
        return (x+calsum(x-1));    
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,sum=0,i=1;
        System.out.print("enter a number");
        n=sc.nextInt();
        while(i<=n){
            sum=sum+i;
            i++;
        }

        System.out.println("sum of first "+n+" natural numbers :"+sum);



        //we have a formula to sum of first n natural numbers....(n*(n+1))/2

        System.out.println(("sum is "+n*(n+1)/2));



        //recursive method...

        int y=calsum(n);
        System.out.println("sum is :"+y);
    }
}

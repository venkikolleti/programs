// sum of digits in a number........

import java.util.Scanner;

public class _10_sum_of_digits {

    static int sum(int n,int sum){
        if(n==0)
            return sum;
        return (sum+=n%10)+sum(n/10,sum);
    }
    
    static int calsum(int n){
        if(n==0)
            return 0;
        return n%10+calsum(n/10);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int x=sc.nextInt();
        int y=x;
        int sum=0;
        while(x!=0){
            sum+=x%10;
            x=x/10;
        }

        System.out.println("sum of digits : "+sum);




        //recursive method...............

        System.out.println("sum is: "+sum(x,sum));

        //recursivw method 2........

        System.out.println("sum is: "+calsum(y));


    }
}

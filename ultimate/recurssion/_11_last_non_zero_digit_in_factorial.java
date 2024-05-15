

import java.util.Scanner;

public class _11_last_non_zero_digit_in_factorial {

    static int factorial(int n){
        if(n==1)
            return 1;
        return n*factorial(n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a num: ");
        int x=sc.nextInt();

        int fact=factorial(x);

        while(fact%10==0){
            fact/=10;
        }
        System.out.println(fact%10);
    }
}



import java.util.Scanner;

public class pascal_triangle {
    static int fact(int n){
        if(n==0 || n==1)
            return 1;
        return n*fact(n-1);
    }

    static int sim1(int n,int m){
        return fact(n)/(fact(n-m)*fact(m));
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a num: ");
        int x=sc.nextInt();

        int i,j; 
        for(i=0;i<=x;i++){
            for(j=0;j<x-i;j++){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print(" "+sim1(i,j));
            }
            System.out.println();
        }

        //System.out.println(fact(5));
        //System.out.println(sim1(5,4));



    }
}

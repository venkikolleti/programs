

import java.util.Scanner;



public class _12_nth_row_in_pascal_triangle {

    static int fact(int n){
        if(n==0 || n==1)
            return 1;
        return n*fact(n-1);
    }
    static int sim(int n,int m){
        return fact(n)/(fact(m)*fact(n-m));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num: ");
        int x=sc.nextInt();

        for(int i=x;i<=x;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" "+sim(i,j));
            }
        }
        System.out.println();
    }
}

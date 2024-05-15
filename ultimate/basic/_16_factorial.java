import java.util.Scanner;

// factorial for a number.......................

public class _16_factorial {

    static int fact(int n){
        if(n==1)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int x=sc.nextInt();
        int fact=1;
        for(int i=x;i>1;i--){
            fact=fact*i;
        }
        System.out.println(fact);


        //recursive method.....

        System.out.println(fact(x));
    }
}

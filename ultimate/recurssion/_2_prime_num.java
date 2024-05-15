import java.util.Scanner;

public class _2_prime_num {

    public static boolean isPrime(int n,int m){
        if(n%m==0)
            return false;
        if(m!=n)
            return true;
        return isPrime(n, m+1);
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the num: ");
        int x=sc.nextInt();


        boolean z=true;
        z=isPrime(x, 2);
        if(z==false)
            System.out.println("it is not a prime number");
        else
            System.out.println("it is a prime number");
    }
}

import java.util.Scanner;

public class _8_prime_or_not {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int x=sc.nextInt();

        int i=2,n=0;
        while(i<x){
            if(x%i==0){
                n++;
                break;
            }
            i++;
            
        }
        String a=(n==0)?"is prime":"not a prime";
        System.out.println(a);

        //System.out.println(Math.sqrt(7));
        
    }
}

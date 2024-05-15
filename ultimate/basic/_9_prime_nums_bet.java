import java.util.Scanner;

public class _9_prime_nums_bet {

    static boolean isprime(int n){

        if(n<2){
            return false;
        }
 
        else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0)
                    return false;      
            }
            return true;
        }
    }
    static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0)
                    return false;      
            }
            return true;
        }
    }
    static boolean IsPrime(int n){
        if(n<2){
            return false;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0)
                    return false;      
            }
            return true;
        }
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the starting num:");
        int x=sc.nextInt();
        System.out.println("enter the ending num:");
        int y=sc.nextInt();

        for(int i=x;i<=y;i++){
            if(isprime(i))
                System.out.print(" "+i);
        }
        System.out.println();
        for(int i=x;i<=y;i++){
            if(isPrime(i))
                System.out.print(" "+i);
        }
        System.out.println();

        for(int i=x;i<=y;i++){
            if(IsPrime(i))
                System.out.print(" "+i);
        }
    }
}

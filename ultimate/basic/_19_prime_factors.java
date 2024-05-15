import java.util.Scanner;

public class _19_prime_factors {

    public static int isprime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
        
    }

    public static void prime_factor(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)==1){
                int x=n;
                while(x%i==0){
                    System.out.print(i+" ");
                    x/=i;
                }
            }
        }
    }
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a num: ");
        int x=sc.nextInt();
        prime_factor(x);
        System.out.println();
    }
}

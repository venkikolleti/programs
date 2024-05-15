import java.util.Scanner;

public class _12_palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=x;
        int rev=0;
        while(x!=0){
            int rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        System.out.println(rev);
        if(y==rev){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
    }
}

import java.util.Scanner;

public class _5_reverse_num {
    static int rev=0;

    static void reverse(int n){
        if(n<10){
            System.out.println(n);
            return;
        }
        System.out.print(n%10);
        reverse(n/10);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a num: ");
        int x=sc.nextInt();
        reverse(x);
        //System.out.println(reverse(x));
    }
}

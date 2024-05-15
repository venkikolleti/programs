import java.util.Scanner;

public class _perfect_square {
    public static boolean perfect_square(int n){
        int m=(int)Math.sqrt(n);
        if(m*m==n){
            System.out.println(m);
            return true;
        }
    return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a num: ");
        int x=sc.nextInt();
        if(perfect_square(x))
            System.out.println("it has perfect square");
        else{
            System.out.println("it has not a perfect square");
        }
    }
}

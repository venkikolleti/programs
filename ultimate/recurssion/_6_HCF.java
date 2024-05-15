
import java.util.Scanner;

public class _6_HCF {
    static int hcf_1(int n,int m){
        if(n==0)
            return m;
        if(m==0)
            return n;
        if(n==m)
            return n;
        if(n>m)
            return hcf_1(n-m,m);
        return hcf_1(n,m-n);
    }
    static int hcf(int a,int b){
        if(b==0){
           return a;
        }
        return hcf(b,a%b);
    } 
    public static void main(String srgs[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a num1: ");
        int x=sc.nextInt();
        System.out.print("enter a num2: ");
        int y=sc.nextInt();
        

        System.out.println(hcf(x,y));

        System.out.println(hcf_1(x,y));

    }
}

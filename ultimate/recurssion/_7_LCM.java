

import java.util.Scanner;

public class _7_LCM {
    static int Hcf(int a,int b){
        if(b==0)
            return a;
        return Hcf(b,a%b);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a num1: ");
        int x=sc.nextInt();
        System.out.print("enter a num2: ");
        int y=sc.nextInt();
        
        int hcf=Hcf(x,y);
        int lcm=(x*y)/hcf;
        int z=(x/hcf)*y;
        System.out.println(hcf);
        System.out.println(lcm);
        System.out.println(z);

    }
}

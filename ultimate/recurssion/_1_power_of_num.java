import java.util.Scanner;

public class _1_power_of_num {

    public static int power(int n,int m){
        if(m==0)
            return 1;
        return n*power(n,m-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the base num: ");
        int x=sc.nextInt();
        System.out.print("enter the exponent num: ");
        int y=sc.nextInt();
        System.out.println("result is: "+power(x,y));

        System.out.println();
        System.out.println(pow(5,3));
    }


    static  int pow(int n,int x){
        if(x==0){
            return 1;
        }
        return n*pow(n,x-1);
    }
}

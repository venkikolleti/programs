import java.util.Scanner;

public class _13_armstrong_num {

    public static int length(int n){
        int len=0;
        while(n!=0){
            len++;
            n/=10;
        }
        return len;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a num: ");
        int x=sc.nextInt(),y=x,z,sum=0;
        int len=length(x);
        while(y!=0){
            z=y%10;
            sum=sum +(int) Math.pow(z,len);
            y=y/10;
        }
        if(sum==x){
            System.out.println("number is armstrong num");
        }
        else{
            System.out.println("not a armstrong num");
        }
    }
}

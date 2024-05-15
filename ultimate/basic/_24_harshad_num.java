import java.util.Scanner;
import java.util.concurrent.Flow.Subscriber;

public class _24_harshad_num {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a num: ");
        int x=sc.nextInt();
        int y=x,sum=0,z=0;
        while(y!=0){
            z=y%10;
            sum=sum+z;
            y/=10;
        }
        System.out.println(sum);
        if(x%sum==0){
            System.out.println("number is harshad num");
        }
        else{
            System.out.println("not a harshad number");
        }
    }
}

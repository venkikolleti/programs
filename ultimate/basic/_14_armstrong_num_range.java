import java.util.*;

public class _14_armstrong_num_range {
    public static int length(int n){
        int len=0;
        while(n!=0){
            len++;
            n/=10;
        }
        return len;
    }

    public static int armstrong(int x){
        int y=x,z,sum=0;
        int len=length(x);
        while(y!=0){
            z=y%10;
            sum=sum +(int) Math.pow(z,len);
            y=y/10;
        }
        if(sum==x){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a num1: ");
        int x=sc.nextInt();
        System.out.print("enter a num1: ");
        int z=sc.nextInt();
        for(int i=x;i<z;i++){
            if(armstrong(i)==1){
                System.out.print(i+" ");
            }
        }
        System.out.println();

    }
}

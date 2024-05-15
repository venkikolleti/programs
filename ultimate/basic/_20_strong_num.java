import java.util.Scanner;

public class _20_strong_num {
    public static int factorial(int n){
        int m=1;
        for(int i=n;i>=1;i--){
            m=m*i;
        }
        //System.out.println(m);
        return m;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a num: ");
        int y=0,sum=0,x=sc.nextInt();
        int z=x;

        while(x!=0){
            y=x%10;
            sum=sum+factorial(y);
            x/=10;
        }

        if(sum==z){
            System.out.println("it is a strong number");
        }
        else{
            System.out.println("it is not a strong number");
        }

    }
}

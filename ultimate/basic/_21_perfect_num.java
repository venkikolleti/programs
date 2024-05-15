import java.util.Scanner;

public class _21_perfect_num {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a num: ");
        int sum=0,x=sc.nextInt(),y=x;
        for(int i=1;i<x;i++){
            if(x%i==0){
                    sum=sum+i;
            }
        }
    
        if(sum==y){
            System.out.println("it is perfect number");
        }
        else{
            System.out.println("not a perfect number");
        }
    }
}

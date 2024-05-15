import java.util.Scanner;

public class _25_abudant_num{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a num :");
        int x=sc.nextInt(),sum=0,y=x;
        for(int i=1;i<x;i++){
            if(x%i==0){
                sum=sum+i;
            }
        }
        if(sum>y){
            System.out.println("it is abudant number");
            System.out.println("abudance is: "+(sum-y));

            
        }
        else{
            System.out.println("not a abudant number");
        }
    }
}
import java.util.Scanner;

public class prime {

    public static boolean pri(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
            else{
                return true;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the starting num: ");
        int num=sc.nextInt();
        System.out.print("enter the ending num: ");
        int num1=sc.nextInt();
        int count=0;
        for(int i=num;i<=num1;i++){
            if(pri(i)){
                count++;
            }
            else{   
            }
        }
        System.out.println(count);
    }
}

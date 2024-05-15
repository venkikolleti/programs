import java.util.Scanner;

public class _26_friendly_pair {
    public static int factors_sum(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a num1: ");
        int x=sc.nextInt();
        System.out.print("enter a num2: ");
        int y=sc.nextInt();

        if(factors_sum(x)/x==factors_sum(y)/y){
            System.out.println(x+" "+y+" "+"are friendly pairs");
        }
        else{
            System.out.println(x+" "+y+" "+"are not friendly pairs");

        }
    }
}

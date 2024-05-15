import java.util.Scanner;

public class _7_leap_year {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int x=sc.nextInt();
        if(x%400==0|| x%4==0 && x%100!=0){
            System.out.println(x+" is leap year");
        }
        else{
            System.out.println("not a leap year");
        }



    // conditional operator......

    String a=x%400==0 || x%4==0&&x%100!=0? x+" is leap year":x+" is not a leap year";
    System.out.println(a);

    



    }
}

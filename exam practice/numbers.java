import java.io.*;
import java.util.Scanner;
import java.math.*;

class num{
    double x;
    num(double x){
        this.x=x;
    }
    public boolean isZero(){
        if(x==0){
            return true;
        }
        return false;
    }
    public boolean isPositive(){
        if(x>0){
            return true;
        }
        return false;
    }
    public boolean isNegative(){
        if(x<0){
            return true;
        }
        return false;
    }
    public boolean isEven(){
        if(x%2==0){
            return true;
        }
        return false;
    }
    public boolean isOdd(){
        if(x%2!=0){
            return true;
        }
        return false;
    }
    double getFactorial(){
        double mul=1;
        for(int i=(int)x;i>=1;i--){
            mul=mul*i;
        }
        return mul;
    }
    double getSqr(){
        double n=x*x;
        return n;
    }

}
public class numbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        double a=sc.nextInt();
        num n=new num(a);
        System.out.println("is zero: "+n.isZero());
        System.out.println("is postive : "+n.isPositive());
        System.out.println("is negative : "+n.isNegative());
        System.out.println("is even : "+n.isEven());
        System.out.println("is odd : "+n.isOdd());
        System.out.println("facorial: "+n.getFactorial());
        System.out.println("square of numbers: "+n.getSqr());
        System.out.println("square of numbers: "+n.getSqr());
    }
}

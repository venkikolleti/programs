import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;




class number {
    private double num;
    number(double num){
        this.num=num;
    }

    boolean isZero(){
        if(num==0)
            return true;
        else
            return false;
    }

    boolean isPositive(){
        if(num>0){
            return true;
        }
        return false;
    }

    boolean isNegative(){
        if(num<0)
            return true;
        return false;
    }

    boolean isOdd(){
        if(num%2!=0)
            return true;
        return false;
    }

    boolean isEven(){
        if(num%2==0)
            return true;
        return false;
    }

    boolean isPrime(){
        int count=0;
        for(int i=2;i<num;i++){
            if(i%2==0)
                count++;
        }
        if(count==0)
            return true;
        return false;
    }


    double getsqr(){
        return Math.pow(num,2);
    }

    double getsqrtof(){
        return Math.pow(num,0.5);
    }


}



public class Number{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a num: ");
        double d=sc.nextDouble();
        number n=new number(d);
        System.out.println("is zero :"+n.isZero());
        System.out.println("is zero :"+n.isPositive());
        System.out.println("is negative :"+n.isNegative());
        System.out.println("is odd :"+n.isOdd());
        System.out.println("is even :"+n.isEven());
        System.out.println("is prime :"+n.isPrime());
        System.out.println("square of :"+n.getsqr());
        System.out.println("square root of :"+n.getsqrtof());




    }
}




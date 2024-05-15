import java.util.*;
public class area_triangle2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the 1st side of traingle: ");
        double a,b,c,s;
        a=sc.nextDouble();
        System.out.print("enter the 2nd side of traingle: ");

        b=sc.nextDouble();
        System.out.print("enter the 3rd side of traingle: ");
        c=sc.nextDouble();
        
        s=(a+b+c)/2;
        System.out.println(s);

        double Area=Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        System.out.println(Area);


    }
}

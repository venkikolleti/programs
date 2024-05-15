import java.util.Scanner;

public class area_triangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the base of traingle: ");
        double base=0,height=0,area=0;
        base=sc.nextDouble();
        System.out.print("enter the height of traingle: ");
        height=sc.nextDouble();

        System.out.print("enter the base of traingle: ");
        area=0.5*(base*height);
        System.out.println(area);

    }
}

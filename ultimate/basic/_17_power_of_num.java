import java.util.Scanner;

public class _17_power_of_num {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the base value: ");
        int x=sc.nextInt();
        System.out.print("enter the exponential value: ");
        int y=sc.nextInt();

        double z=Math.pow(x,y);
        System.out.println(z);
    }
}

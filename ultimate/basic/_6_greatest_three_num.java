import java.util.*;

public class _6_greatest_three_num {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number1: ");
        int x=sc.nextInt();
        System.out.print("enter number2: ");
        int y=sc.nextInt();
        System.out.print("enter number3: ");
        int z=sc.nextInt();
        if(x>=y && x>=z)
            System.out.println(x+" is greater");
        else if(y>=x && y>=z)
            System.out.println(y+" is greater");
        else
            System.out.println(z+" is greater");

        


    // conditional operator......

    String a=x>=y&&x>=z?x+" is greater":y>=x&&y>=z?y+" is greater":z+" is  greater";
    System.out.println(a);
    }
}

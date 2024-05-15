import java.util.Scanner;

//greatest among two numbers...................

public class _5_greatest_two_num {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number1: ");
        int x=sc.nextInt();
        System.out.print("enter number2: ");
        int y=sc.nextInt();

        if(x>y)
            System.out.println(x+" is greater");
        else if(x<y)
            System.out.println(y+" is greater");
        else
            System.out.println("both are equal");



        //using conditional operator.......

        String a=x>=y?((x==y)?"both are equal":x+" is greater"):y+" is greater";
        System.out.println(a);




        //inbuilt function..........

        System.out.println("greater number is "+Math.max(x, y));



    }
}

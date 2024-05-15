import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.event.InternalFrameEvent;

public class user_input {
    public static void main(String[] args){




//input from the user.....................


        Scanner input =new Scanner(System.in);
        System.out.print("enter your name:");
        System.out.println("your name is:"+input.next());
        System.out.print("enter a integer:");
        System.out.println(input.nextInt());

        System.out.print("enter a Float:");
        System.out.println(input.nextFloat());

        System.out.print("enter a Double:");
        System.out.println(input.nextDouble());


        Scanner ab=new Scanner(System.in);
        System.out.print("enter a string with spaces:");
        String S11=ab.nextLine();
        System.out.println(S11);

        //Scanner W2= new Scanner(System.in);

    }
}

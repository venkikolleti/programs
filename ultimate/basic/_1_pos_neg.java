import java.util.Scanner;

public class _1_pos_neg {

    String demo(int n){
        if(n>=0)
            return "positive";
        return "negative";
    }
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int x=sc.nextInt();
        if(x>=0)
            System.out.println("given number is positive");
        else
            System.out.println("given number is negative");

        _1_pos_neg obj=new _1_pos_neg();
        System.out.println(obj.demo(x));


        //best method..........
        String a=(x>=0)?"positive":"negative";
        System.out.println(a);
    }
}

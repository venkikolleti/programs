import java.util.Scanner;

//check whether the given number is even or odd

public class _2_even_odd {
    String simple(int x){
        if(x%2==0)
            return "given number is even";
        else    
            return "given number is odd";
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int n=sc.nextInt();
        _2_even_odd obj=new _2_even_odd();
        System.out.println(obj.simple(n));

        //best method;
        String a=(n%2==0)?"even":"odd";
        System.out.println(a);
    }
}

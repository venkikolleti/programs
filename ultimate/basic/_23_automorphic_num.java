import java.util.Scanner;

public class _23_automorphic_num {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a num: ");
        int x=sc.nextInt();
        int y=x*x;
        if((x%10)==(y%10)){
            System.out.println("yes it is automorphic number");
        }
        else{
            System.out.println("not a automorphic number");
        }
    }
}

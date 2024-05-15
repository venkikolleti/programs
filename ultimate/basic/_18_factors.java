import java.util.Scanner;

public class _18_factors {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a num: ");
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            if(x%i==0)
                System.out.print(i+" ");

        }
        System.out.println();


        for(int i=1;i<=x/2;i++){
            if(x%i==0)
                System.out.print(i+" ");

        }
        System.out.println(x);

        




        for(int i=1;i<=Math.sqrt(x);i++){
            if(x%i==0)
                if(i==x/i)
                    System.out.print(i+" ");
                else
                    System.out.print(i+" "+x/i+" ");

        }
        System.out.println();

    }
}

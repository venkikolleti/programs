import java.util.Scanner;

public class venki {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int a,b;
        System.out.println("enter two numbers:");
        a=input.nextInt();
        b=input.nextInt();
        if(a<b){
            System.out.println("a is smaller");
        }
        else{
            System.out.println("b is smaller");
        }

        int i=1;
        while(i<5){
                System.out.print(i+" ");
                i++;
        }
        System.out.println(" ");
        for(int j=0;j<5;j++){
            System.out.print(j+" ");
        }
        System.out.println("\n");



        for(int k=1;k<=5;k++){
            for(int l=1;l<=k;l++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }



    }
}

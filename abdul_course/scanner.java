import java.util.*;

public class scanner {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        boolean x=sc.hasNextInt();
        int z=sc.nextInt();
        boolean y=sc.hasNextInt();
        int w=sc.nextInt();
        System.out.println(z+" "+w);
        System.out.println(x+" "+y);


        sc.useRadix(2);
        int k=sc.nextInt();
        System.out.println(k);



    }
}

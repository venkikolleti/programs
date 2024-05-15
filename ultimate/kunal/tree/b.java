import java.util.*;

public class b {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int i=sc.nextInt();
        int count=0;
        if(i>999){
            for(int j=1000;j<=i;j++){


                count++;
            }
        }
        else{
            System.out.println(count);
        }
        System.out.println(count);
    }  
}


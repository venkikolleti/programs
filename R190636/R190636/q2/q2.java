import java.util.Arrays;
import java.util.Scanner;

public class q2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        int[] arr=new int[size];
        int[] product=new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int pro=0;

        for(int i=0;i<size;i++){
            pro=pro+arr[i];
        }
        for(int i=0;i<size;i++){
            int n=pro-arr[i];
            product[i]=n;
        }
        System.out.println(Arrays.toString(product));
    }
}

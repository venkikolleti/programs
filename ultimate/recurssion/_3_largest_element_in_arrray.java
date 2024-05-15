import java.util.Scanner;

public class _3_largest_element_in_arrray {
    public static int largest_element(int arr[],int i){ 
        if(i==1)
            return arr[0];
        return Math.max(arr[i-1],largest_element(arr, i-1));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        for(int i=0;i<7;i++){
            System.out.print("enter the elenment "+i+" :");
            arr[i]=sc.nextInt();
        }

        System.out.println(largest_element(arr,7));

    }
}

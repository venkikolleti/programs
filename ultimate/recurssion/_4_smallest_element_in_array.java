import java.util.Scanner;

public class _4_smallest_element_in_array {

    static int smallest(int arr[],int n){
        if(n==1)
            return arr[0];
        return Math.min(arr[n-1],smallest(arr, n-1));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        for(int i=0;i<7;i++){
            System.out.print("enter the elenment "+i+" :");
            arr[i]=sc.nextInt();
        }
        int x=arr.length;
        System.out.println(smallest(arr,x));
    }
}

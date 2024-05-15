import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class building {
    
    public static void main(String args[]){

        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        ArrayList<Integer> arr1=new ArrayList<>();
        int count=0,k=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                count++;
            }
            else{
                arr1.add(count);
                count=0;
            }
        }
        arr1.add(count);
        System.out.println(arr1);
        System.out.println(Collections.max(arr1));

        



    }
}

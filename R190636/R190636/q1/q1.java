import java.util.Arrays;
import java.util.*;
public class q1 {
    public static void main(String args[]){
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        int cou=0,count=0,diff=0;
        for(int k=1;k<n;k++){
            diff=arr[k-1]-arr[k];
            if(diff<0 && count>0){
                cou=count;
                count=0;
            }
            while(k<n && (arr[k-1]-arr[k]<0)){
                count++;
                k++;

            }
            if(cou>=count){
                count=cou;
            }

        }

        System.out.println(count);

    }
}

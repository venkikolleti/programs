import java.util.*;
public class swap {
    public static void main(String args[]){
        int[] arr={1,3,6,8,34,63,7,9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            end--;
            start++;
        }
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}

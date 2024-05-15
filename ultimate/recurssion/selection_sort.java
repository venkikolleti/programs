import java.util.*;
public class selection_sort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sort(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int row,int col,int max){
        
        if(row==0){
            return;
        }
        if(col<=row){
            if(arr[col]>arr[max]){
                max=col;
            }
            sort(arr,row,col+1,max);
        }else{
            int temp=arr[max];
            arr[max]=arr[row];
            arr[row]=temp;

            sort(arr, row-1, 0, 0);
        }
    }
}

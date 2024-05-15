import java.util.Arrays;

public class selection_sort {

    static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={6,2,9,27,44};
        select(arr);
        System.out.println(Arrays.toString(arr));

        sort(arr);
    }


    static void select(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int index=getMaxIndex(arr,0,last);
            int temp=arr[index];
            arr[index]=arr[last];
            arr[last]=temp;
        }
    }
    static int getMaxIndex(int[] arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
}

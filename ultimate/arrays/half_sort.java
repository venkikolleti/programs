import java.util.Arrays;

public class half_sort {
    public static void main(String args[]){
        int[] arr={20,15,10,5,4,1,2,78,21,4,8,8};
        int mid=arr.length/2;
                System.out.println(Arrays.toString(arr));
        ascen_sort(arr,0,mid);
        desc_sort(arr,mid,arr.length);

        System.out.println(Arrays.toString(arr));
    }
    static void ascen_sort(int[] arr,int start,int end){
        for(int i=start;i<end;i++){
            for(int j=start;j<end;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    static void desc_sort(int[] arr,int start,int end){
        for(int i=start;i<end;i++){
            for(int j=i+1;j<end;j++){
                if(arr[j-1]<arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        boolean check;
        for(int i=0;i<arr.length;i++){
            check=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    check=true;
                }
            }
            if(!check){
                break;
            }
        }
    }

}

import java.util.Arrays;

public class selection {
    public static void main(String args[]){
        int arr[]={3,6,2,1,8,4,9};

        for(int i=0;i<arr.length;i++){
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index =j;
                }
            }
            int small=arr[index];
            arr[index]=arr[i];
            arr[i]=small;
        }

        System.out.println(Arrays.toString(arr));
    }
}

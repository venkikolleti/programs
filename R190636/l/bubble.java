import java.util.*;
public class bubble {
    public static void main(String args[]){
        String[] arr={"venki","kolleti","venkaiah","hello","hiii"};

        /*for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].compareTo(arr[j])>0){
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }*/

        Arrays.sort(arr,Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));

        


    }
}

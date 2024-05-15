import java.util.*;
public class repeate {
    public static void main(String args[]){
        int[] arr={10,20,30,20,40,30,10,10};
        Arrays.sort(arr);
        for(int i=1;i<arr.length-1;i++){
            int flag=0;
            while(i<arr.length-1&&arr[i-1]==arr[i]){
                flag=1;
                i++;
            }
            if(flag==1){
                System.out.println(arr[i-1]);
            }
        }
    }
}

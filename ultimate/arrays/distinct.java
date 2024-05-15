import java.util.Arrays;

public class distinct {
    public static void main(String args[]){
        int[] arr={10,20,30,40,50,60,90};
        Arrays.sort(arr);
        int count=1;
        for(int i=1;i<arr.length;i++){  
            if(arr[i-1]==arr[i]){
                continue;
            }
            else{
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);



    }
}

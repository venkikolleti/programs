import java.util.*;
public class sub_array {
    public static void main(String args[]){
        //Scanner sc=new Scanner(System.in);
        int[] arr={3,-3,4,6,-10,9,8,-8};
        int sum=0,count=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==0){
                    count++;
                    sum=0;
                }       
            }
        }
        

        System.out.println("number of subarrays forms 0 sum is "+count);
    }
}

import java.util.*;
public class remove_duplicates_inArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1,2,3,4,2,1,6,6,6,7,7,7,5};
        Arrays.sort(arr);
        //removeDuplicates(arr);
        //removeDuplicates2(arr);
        LessOccurance(arr);
    }

    static void removeDuplicates(int[] arr){
        int k=0;
        for(int i=1;i<arr.length;i++){
            if(arr[k]!=arr[i]){
                arr[++k]=arr[i];
            }
        }
        System.out.println(k+1);
        for(int i=0;i<=k;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }



    static void removeDuplicates2(int[] arr){
        int k=0;
        int[] arr2=new int[arr.length];
        arr2[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr2[k]!=arr[i]){
                arr2[++k]=arr[i];
            }
        }
        System.out.println(k);
        System.out.println(Arrays.toString(arr2));
    }

    static void LessOccurance(int[] arr){
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                if(count<2)
                    System.out.println(arr[i-1]);
                count=0;
            }
            else{
                count++;
            }

        }
        if(count<2){
            System.out.println(arr[arr.length-1]);
        }
        
    }



}

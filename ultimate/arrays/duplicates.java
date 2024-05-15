import java.util.*;

public class duplicates {

    public static  void remove(int[] arr){
        Arrays.sort(arr);
        int a=0;
        /*for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i])
                arr[a++]=arr[i];
            
        }*/

    }
    public static void main(String args[]){
        int[] arr={10,20,30,40,50,60,70,10,20,30,40};
        Set s=new HashSet();
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        System.out.println(s);


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int k=1;
        for(int i=1;i<arr.length;i++){
            if(arr[k-1]!=arr[i]){
                arr[k++]=arr[i];
                System.out.println(arr[i]+" "+k);
            }
            else{
                System.out.println(arr[i]);
            }
        }   
        
        System.out.println(Arrays.toString(arr));


        String st1="this is venki kolleti";
        String[] str=st1.split(" ");
        System.out.println(Arrays.toString(str));
        String newtr="";
        for(int i=str.length-1;i>=0;i--){
            newtr+=str[i]+" ";
        }
        System.out.println(newtr);


        int sum=0;
        String str2="12slkddoh34jo6kjoi9";
        for(int i=0;i<str2.length();i++){
            if(Character.isDigit(str2.charAt(i))){
                sum+=Character.getNumericValue(str2.charAt(i));
            }
        }

        System.out.println(sum);
    }

}

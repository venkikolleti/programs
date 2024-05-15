import java.text.DecimalFormat;
import java.util.*;
public class m {
    public static void main(String[] args) {
        String str="2 4 5 6 7 8 2 4 5 2 3 8";
        String strArray[]=str.split(" ");
        double arr[]= new double[strArray.length];
        for(int i=0;i<strArray.length;i++){
            arr[i]=Double.parseDouble(strArray[i]);
        }
        DecimalFormat df=new DecimalFormat("#.#");
        System.out.println(df.format(mean(arr)));
        System.out.println(Math.round(mean(arr)));
        System.out.println(meadian(arr));

        System.out.println(mode(arr));
    }
    static double mean(double[] arr){
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }
    static double meadian(double[] arr){
        Arrays.sort(arr);
        int mid=arr.length/2;
        if(arr.length%2==0){
            return (arr[mid]+arr[mid-1])/2;
        }
        else{
            return arr[mid];
        }
    }

    static int mode(double arr[]){
        int c[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            c[i]=count;
        }
        int m=0;
        int l=-1;
        for(int i=0;i<c.length;i++){
            if(c[i]>l){
                m=i;
                l=c[i];
            }
        }
        return (int)arr[m];
    }


    /*static int rotation(String s1,String s2){
        int count=0;
        int i=1;
        while(i){
            if(s1.equals(s2)){
                return count;
            }
            char c=s1.charAt(s1.length()-i);
            String str=s1.substring(0, s1.length()-i);

            String fstr=str+c;
            System.out.println(fstr);
        }
    }

    static int rotation2(String s1,String s2){
        int count=0;
        int i=1;
        while(true){
            if(s1.equals(s2)){
                return count;
            }
            char c=str.charAt(s1.length()-1);
            String str=c+s1.substring(0, s1.length()-2);
            count++;
        }
    }*/

}

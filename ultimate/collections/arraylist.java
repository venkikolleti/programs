import java.util.ArrayList;
import java.util.Arrays;

import javax.sound.midi.SysexMessage;

public class arraylist {
    
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println(arr.size());
        arr.add(10);
        arr.add(20);
        arr.add(0,30);

        System.out.println(arr);

        Integer[] arr1=new Integer[]{1,2,3,4,5};
        ArrayList<Integer> arr2=new ArrayList<>(Arrays.asList(arr1));

        System.out.println(arr2);

        for(int i=0;i<arr2.size();i++){
            System.out.print(arr2.get(i)+" ");
        }
        System.out.println();

        System.out.println(arr2.indexOf(9));

        for(int num:arr2){
            System.out.print(num+" ");
        }
        System.out.println();

        arr2.add(0,100);
        System.out.println(arr2);

    }
}

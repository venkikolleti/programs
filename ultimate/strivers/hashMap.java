import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,2,1};
        Map<Integer,Integer> frequency=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(frequency.containsKey(arr[i]))
                frequency.put(arr[i],frequency.get(arr[i])+1);
            else{
                frequency.put(arr[i],1);
            }
        }
        Set<Integer> keys=frequency.keySet();
        for(Integer num:keys){
            System.out.println(num+" occured int: "+frequency.get(num));
        }

        for(int val:frequency.keySet()){
            if(frequency.get(val)==1){
                System.out.println(val+" occured only once");
            }
        }
    }
}

import java.util.*;
public class subSetRecursive {
    public static void main(String[] args) {
        List<List<Integer>> res=new ArrayList();
        int[] arr={1,2,3};
        generateSubsets(0,arr,new ArrayList(),res);
        System.out.println(res);
    }
    static void generateSubsets(int index,int[] arr,List<Integer> current,List<List<Integer>> res){
        res.add(new ArrayList(current));
        for(int i=index;i<arr.length;i++){
            if(i<index && current.contains(arr[i])) continue;
            current.add(arr[i]);
            generateSubsets(index+1, arr, current, res);
            current.remove(current.size()-1);
        }
    }
}

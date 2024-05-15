import java.util.*;

public class permutationArray {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> ans=new ArrayList<>();
        generatePermutations(arr, new ArrayList<>(), ans);



        System.out.println(ans);
    }


    static void generatePermutations(int[] nums,List<Integer> current,List<List<Integer>> ans){
        if(current.size()==nums.length){
            ans.add(new ArrayList(current));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(current.contains(nums[i])) continue;
            current.add(nums[i]);
            generatePermutations(nums,current,ans);
            current.remove(current.size()-1);
        }
    }


    //allow duplicates


    
}


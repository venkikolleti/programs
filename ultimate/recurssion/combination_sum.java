import java.util.ArrayList;
import java.util.*;
public class combination_sum {
    public static void main(String[] args) {
        int[] candidates={2,5,2,1,2};
        int target=5;
        System.out.println(combinationSum(candidates,target));
    }
    //combination sum-1 with repeating same element also
    public static  List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        generateCombination2(0, candidates, new ArrayList<>(), ans, target);
        return ans;
    }
    static void generateCombination(int start,int[] candidates,List<Integer> current,List<List<Integer>> ans,int target){
        if(target==0){
            ans.add(new ArrayList(current));
        }
        if(target<0){
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(i>start && candidates[i]==candidates[i-1]) continue;
            current.add(candidates[i]);
            generateCombination(i+1, candidates,current, ans, target-candidates[i]);
            current.remove(current.size()-1);

        }
    }

    //combination sum-2 without repeating same
    static void generateCombination2(int start,int[] candidates,List<Integer> current,List<List<Integer>> ans,int target){
        if(target==0){
            ans.add(new ArrayList(current));
        }
        if(target<0){
            return;
        }
        for(int i=start;i<candidates.length;i++){
            current.add(candidates[i]);
            generateCombination(i, candidates,current, ans, target-candidates[i]);
            current.remove(current.size()-1);

        }
    }
}

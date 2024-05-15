import java.util.*;
public class permuationsArrayDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>> ans=new ArrayList<>();
        boolean used[] =new boolean[arr.length];
        generate(arr, new ArrayList<>(), ans,used);
        System.out.println(ans);
    }
    static void generate(int nums[],List<Integer> current,List<List<Integer>> ans,boolean[] used){
        if(current.size()==nums.length){
            ans.add(new ArrayList(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i] || ((i>0 && nums[i]==nums[i-1]) && (!used[i-1])) ) continue;
            used[i]=true;
            current.add(nums[i]);
            generate(nums,current,ans,used);
            current.remove(current.size()-1);
            used[i]=false;
        }
    }
}

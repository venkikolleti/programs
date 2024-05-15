import java.util.*;
public class SubSets {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>> list=subset(arr);
        /*for(List<Integer> li:list){
            System.out.println(li);
        }*/
        //System.out.println(list);
        int[] arr2={1,2,2};
        //System.out.println(subsetDuplicatesRemove(arr2));

        //System.out.println(combine(4,2));


        List<List<Integer>> ans=new ArrayList<>();
        subsetRecursive(0, arr,new ArrayList<>(), ans);
        System.out.println(ans);
    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }


    static List<List<Integer>> subsetDuplicatesRemove(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int j=0;j<arr.length;j++){
            start=0;
            if(j>0 && arr[j]==arr[j-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();
            for(int i=start;i<n;i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(arr[j]);
                outer.add(internal);
            }
        }

        return outer;
    }


    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> outer=new ArrayList();
        List<List<Integer>> ans=new ArrayList();

        if(n<=0){
            return outer;
        }
            outer.add(new ArrayList());
        for(int i=1;i<=n;i++){
            int m=outer.size();
            for(int j=0;j<m;j++){
                List<Integer> inner =new ArrayList<>(outer.get(j));
                inner.add(i);
                outer.add(new ArrayList(inner));
                if(inner.size()==k){
                    ans.add(inner);
                }
            }
        }
        return ans;
    }





    static void subsetRecursive(int start,int[] arr,List<Integer> current,List<List<Integer>> ans){
        if(!current.isEmpty()){
            ans.add(new ArrayList<>(current));
        }
        if(current.size()==arr.length){
            return;
        }
        for(int i=start;i<arr.length;i++){
            current.add(arr[i]);
            subsetRecursive(i+1, arr, current, ans);
            current.remove(current.size()-1);
        }
    }

}

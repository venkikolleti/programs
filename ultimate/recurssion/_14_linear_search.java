import java.util.ArrayList;

public class _14_linear_search {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5};
        System.out.println(search(arr,4,0));
        System.out.println(searchFromLast(arr,4,arr.length-1));
        findAllIndex(arr, 4, 0);
        System.out.println(list);
    }
    static int search(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return search(arr,target,index+1);
    }
    static int searchFromLast(int[] arr,int target,int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return searchFromLast(arr, target, index-1);
    }

    static ArrayList<Integer> list=new ArrayList<>();
    static void findAllIndex(int[] arr,int target,int index){
        if(index==arr.length-1){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }
}

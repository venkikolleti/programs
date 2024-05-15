import java.util.ArrayList;

public class _15_Return_Arraylist {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5,4};
        System.out.println(findAll(arr, 4, 0));
    }
    static ArrayList<Integer> findAll(int[] arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();

        if(index==arr.length){
            return list;
        }

        if(arr[index]==target){
            list.add(index);
        }
        list.addAll(findAll(arr, target, index+1));
        return list;
    }
}

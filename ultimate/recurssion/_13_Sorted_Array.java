public class _13_Sorted_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,7,5,6};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return sorted(arr,index+1);
    }
}

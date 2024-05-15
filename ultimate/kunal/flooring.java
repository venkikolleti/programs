public class flooring{
    static int search(int[] arr,int target){

        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        /*if(arr[mid]<target){
            return arr[mid+1];
        }
        while(arr[--mid]>=target){
        }*/
        return arr[end];
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,11};//,13,44,66,68,78,79,89,97};
        System.out.println(search(arr, 8));
    }
}
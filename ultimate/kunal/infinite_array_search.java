public class infinite_array_search {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9,12,13,15,44,55,66};
        int target=4;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return search(arr, target, start, end);
    }
    static int search(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}

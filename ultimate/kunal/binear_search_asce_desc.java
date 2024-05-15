public class binear_search_asce_desc {
    public static void main(String[] args) {
        int[] arr={1,23,33,44,55,66,77};
        int[] arr1={111,83,53,44,35,26,17};

        System.out.println(search(arr, 77));
        System.out.println(search(arr1, 26));

    }
    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean chk=arr[start]<arr[end];
        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(chk){
                if(arr[mid]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(arr[mid]<target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            
        }
        return -1;
    }
}

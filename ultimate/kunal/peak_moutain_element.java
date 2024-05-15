//162-------852 leet code questions 1095

public class peak_moutain_element {
    public static void main(String[] args) {
        int[] arr={0,1,3,4,6,5,3,2,1,0};
        System.out.println(search(arr));
    }
    static int search(int[] arr){
        int start=0,mid=0;
        int end=arr.length-1;
        while(start<end){
            mid=(start+end)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return arr[start];
    }
}

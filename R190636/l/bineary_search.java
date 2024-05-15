public class bineary_search {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int searchelement=6;

        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==searchelement){
                System.out.println("found: "+mid);
                break;
            }
            else if(arr[mid]>searchelement){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        if(start>end){
            System.out.println("not found");
        }
    }
}

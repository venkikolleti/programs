public class second_largest {
    public static void main(String args[]){
        int[] arr={1,3,4,5,7,9};
        int largest=arr[0];
        int largest2=arr[0];
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest2=largest;
                largest=arr[i];
            }
        }
        System.out.println(largest+" "+largest2);
    }
}

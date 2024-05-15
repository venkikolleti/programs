public class linear {
    public static void main(String args[]){
        int arr[]={1,2,3,4,56,7,88,9};
        int searchelement=4;
        int i=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]==searchelement){
                System.out.println("search element is:"+i);
                break;
            }
        }
        if(i>=arr.length){
            System.out.println("element not found");
        }

    }
}

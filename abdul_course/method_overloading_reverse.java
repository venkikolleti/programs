public class method_overloading_reverse {

    static int reverse(int num){
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        return rev;
    }

    static int[] reverse(int arr[]){
        int b[]=new int[arr.length];
        for(int i=arr.length-1,j=0;i>=0;i--,j++){
                b[j]=arr[i];
        }
        for(int m:b){
            System.out.print(m+" ");
        }
        System.out.println();
        
        return b;
    }

    public static void main(String args[]){
        System.out.println(reverse(763));

        int arr[]={1,2,3,4,5};
        int a[]=reverse(arr);
        
        for(int k:reverse(arr)){
            System.out.print(k+" ");
        }
        System.out.println();
        System.out.println();



    }
}

public class gcd {

    static void gcd_num(int a,int b){
        if(a==b){
            System.out.println(a);
        }
        else if(a>b){
            gcd_num(a-b,b);
        }
        else{
            gcd_num(a,b-a);
        }
    }


    /*static int max_num(int arr[],int i,int n,int max){
        if(i<n){
            if(arr[i]>=max){
                max=arr[i];
                max_num(arr,i++,n,max);
            }
            else
                max_num(arr,i++,n,max);
        }   
        return max;
        
    }*/
    


    public static void main(String args[]){
        gcd_num(15,25);
        int arr[]={1,2,3,4,5};
        //System.out.println(max_num(arr,0,arr.length,arr[0]));
    }
}

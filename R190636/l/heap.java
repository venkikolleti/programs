import java.util.Arrays;

public class heap {

    static void max_heapify(int[] arr,int n,int i){
        int largest,l,r;
        largest=i;
        l=2*i+1;
        r=2*i+2;
        if(l<n && arr[l]>arr[largest]){
            largest=l;
        }
        if(r<n && arr[r]>arr[largest]){
            largest=r;
        }
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            max_heapify(arr, n, largest);
        }
    }

    static void build_maxheap(int[] arr,int n){
        for(int i=n/2-1;i>=0;i--){
            max_heapify(arr,n,i);
        }
    }
    static void heapsort(int[] arr,int n){
        build_maxheap(arr,n);
        int i,temp;
        for(i=arr.length-1;i>=1;i--){
            temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            max_heapify(arr,i,0);
        }

        
    }
    public static void main(String args[]){
        int arr[]={1,4,6,8,9,7,5,3,2,10,20,40,15,25,35,32,23,33};

        heapsort(arr,arr.length);

        System.out.println(Arrays.toString(arr));
    }
}

import java.util.Scanner;

public class q3 {

    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the difference value: ");
        int element =sc.nextInt();

        int flag=0;
        int diff=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                diff=arr[i]-arr[j];
                if(diff==element || diff==(-element)){
                    System.out.println("\n"+arr[i]+" "+arr[j]);
                    flag=1;
                    break; 
                }
            }
            if(flag==1){
                break;
            }
        }
        if(flag!=1){
            System.out.println(" \n No such pair");
        }

    }
}

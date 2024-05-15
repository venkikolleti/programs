import java.util.*;
import java.io.*;
public class array2d_1{
    public static void main(String args[]){
        System.out.println("hello");

        int[][] arr2={{1,2,3,4},{4,5,6},{6,7},{8}};
        

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

        for(int a[]:arr2){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }




        ArrayList<ArrayList<Integer>> a=new ArrayList<>();

        for(int i=0;i<3;i++){
            a.add(new ArrayList<>());
        }

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int x=sc.nextInt();
                a.get(i).add(sc.nextInt());
                //a.add(x);
                
            }
        }

        System.out.println(a);
    }
}

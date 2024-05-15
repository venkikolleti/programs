import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exc_arraylist {
 public static void main(String args[]){

    ArrayList<Integer> integers=new ArrayList<>();

    Scanner input=new Scanner(System.in);
    System.out.print("enter the size of arrayList: ");
    int n=input.nextInt();
    System.out.println("enter"+ n +"intergers");

    for(int i=0;i<n;i++){
        int data=input.nextInt();
        if(!integers.contains(data)){
            integers.add(data);
        }
    }
    Collections.sort(integers);
    System.out.println(integers);
 }   
}

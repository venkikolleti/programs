// WE CAN WRITE THE PROGRAM IN DIFFERENT WAY I WRITE IN THIS WAY..


import java.lang.invoke.StringConcatFactory;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class array_char {
    public static void main(String args[]){
        String[] arr={"r","g","b","g"};
        ArrayList<Character> arr1=new ArrayList<>();
        //arr1.add("q");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<100;i++){
            System.out.print("Enter 1 to addd character to array or 0 to not add any more : ");
            int num=sc.nextInt();
            if(num==1){
                    System.out.print("Enter the Character R G B any one : ");
                    String ch=sc.next();
                    char chara=ch.charAt(0);
                    if(chara=='R' || chara=='G' || chara=='B'){
                        arr1.add(chara);
                        System.out.println("added successfuly");
                    }
                    else{
                        System.out.println("You have entered an invalid character ");
                    }
            }
            else{
                break;
            }
        }

        int index=0;
        for(char s:arr1){
            index++;
        }
        //String str[]=new String[index];
        char[] str=new char[index];
        int k=0;
        for(char s1:arr1){
            str[k++]=s1;
        }
        
        for(int i=0;i<str.length;i++){
            for(int j=1;j<str.length-i;j++){
                if(str[j-1]<str[j]){
                    char temp=str[j-1];
                    str[j-1]=str[j];
                    str[j]=temp;
                }
            }
        }
        

        System.out.println(Arrays.toString(str));
        






    }
}

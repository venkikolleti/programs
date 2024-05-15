import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class _8_length_of_string {
    static int length(String str){
        if(str==""){
                return 0;
        }
        else
            return 1+length(str.substring(1));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a String: ");
        String x=sc.next();

        System.out.println(length(x));

        int i=0;
        char ch[]=x.toCharArray();
        for(char c:ch){
            i++;
        }
        System.out.println(i);
    }
}

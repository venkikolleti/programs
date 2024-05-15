import java.io.*;
import java.util.*;

public class string1 {

    
    public static void main(String args[]){
        String a="xxhgxxxxbdhxx";
        for(int i=1;i<a.length()-1;i++){
            if(a.charAt(i)=='x'){
                a=chardelAt(a,i);
            }
            
        }

        System.out.println(a);  
    }
    public static String chardelAt(String a,int m){
        String p=(a.substring(0,m)+ a.substring(m+1));
        return p;
    }

    

}

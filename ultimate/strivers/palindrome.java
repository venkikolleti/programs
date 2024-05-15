import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        String str="abcba";
        System.out.println(StringPalindrome(str));
        
    }
    static boolean StringPalindrome(String s){
        int start=0;
        int end=s.length()-1;
        
        while(start<=end){
            
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            
            if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))){
                return false;
            }
            else{
                start++;
                end--;
            }
            
        }
        return true;
    }
}

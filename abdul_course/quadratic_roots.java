import java.util.Scanner;

public class quadratic_roots {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double a=0,b=0,d=0;
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        for(char c:ch){
            if(c!='x' && ++c!='^'){
                a=a*10+(c%10);
            }
            else if(c!='x'){
                b=b*10+c%10;
            }
            else{
                d=d*10+c%10;
            }
        }
        System.out.println(a+" "+b+" "+d);
        
    }
}

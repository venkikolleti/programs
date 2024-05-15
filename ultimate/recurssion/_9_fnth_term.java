

import java.util.Scanner;

public class _9_fnth_term {
    static int sim1(int n,int current,int m){
        int num=1,i;
        if(current==m+1){
            return 0;
        }
        for(i=n;i<n+current;i++){
            num*=i;
        }
        return num+ sim1(i,current+1,m);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a num: ");
        int x=sc.nextInt();

        System.out.println(sim1(1,1,x));
    }
}

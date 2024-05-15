import java.util.Scanner;

public class _4_sum_of_range_num {



    static int sum(int x,int y){
        if(y==x)
            return y;
        return (y+sum(x,y-1));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number start from: ");
        int n=sc.nextInt();
        System.out.print("enter the number end with: ");
        int m=sc.nextInt();
        int i,sum=0;
        for(i=n;i<=m;i++){
            sum+=i;
        }
        System.out.println("sum  of numbers from "+n+" to "+m+" is "+sum);



        //recursive mwthod 

        System.out.println("sum is "+sum(n,m));

    }
}

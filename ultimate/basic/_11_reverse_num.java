import java.util.Scanner;

public class _11_reverse_num {
    
    static int reverse(int num,int rev){
        if(num==0)
            return rev;
        
        int rem=num%10;
        rev=rev*10+rem;
        return reverse(num/10,rev);
    }

    static int Reverse(int num){
        if(num==0)
            return 0;
        
        int rem=num%10;
        System.out.print(rem);
        return Reverse(num/10);
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int x=sc.nextInt();
        int y=x,z=x;
        
        int num=0,rev=0,rever=0;
        while(x!=0){
            num=x%10;
            rev=rev*10+num;
            x=x/10;
        }

        System.out.println("reversed number is: "+rev);




        //recursion method.....

        System.out.println("reversed number is: "+reverse(y,rever));

        Reverse(z);



    }
}

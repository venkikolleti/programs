import java.util.Scanner;




public class exam1 {

    static void odd_even_string(String s){
        String odd="";
        String even="";
        for(int i=0;i<s.length();i++){
            if(i%2==0)
                odd=odd+s.charAt(i);
            else
                even=even+s.charAt(i);
        }

        System.out.println(even+"\n"+odd);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num);
        int rem=0,mery=0,hery=0;
        while(num!=0){
            rem=num%10;
            num=num/10;
            if(rem%2==0)
                hery++;
            else
                mery++;
        }
        System.out.println(mery+"\n"+hery);


        odd_even_string("programming");

    }
}

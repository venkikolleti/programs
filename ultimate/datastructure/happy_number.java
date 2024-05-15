//202 leetcode
//https://leetcode.com/problems/happy-number/

public class happy_number {

    public static boolean ishappy(int n){
        int slow=n;
        int fast=n;
        do{
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }while(slow!=fast);

        if(slow==1){
            return true;
        }
        return false;
    }

    public static int findSquare(int num){
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans=ans+(rem*rem);
            num=num/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(ishappy(19));
    }
}

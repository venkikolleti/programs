public class all {
    public static void main(String[] args) {
        //leapYear(1700);
        //primeInRange(20);
        //sumOfDigits(1234);
        //System.out.println(sumOfDigitsRecursion(1234));
        //reverseNumber(1234);
        //stringPalin("radara");
        //armstrongNum(371);
        //fibanacci(14);
        //factorial(4);
        //power(2,3);
        //perfectNumber(6);
        hcf(36,60);
        System.out.println(HcfRec(36, 60));
    }

    static void hcf(int num1,int num2){
        int min=Math.min(num1,num2);
        int result=1;
        for(int i=2;i<min;i++){
            if(num1%i==0 && num2%i==0){
                result=i;
            }
        }
        System.out.println(result);
    }

    static int HcfRec(int a,int b){
        if(b==0)
            return a;
        return HcfRec(a%b, a);
    }


    static void perfectNumber(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }



    static void power(int base,int index){
        int val=base;
        for (int i=0;i<index-1;i++){
            val=val*base;
        }
        System.out.println(val);
    }

    static void factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }

    static void fibanacci(int len){
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        int nextterm=0;
        for(int i=2;i<len;i++){
            nextterm=a+b;
            a=b;
            b=nextterm;
            System.out.print(nextterm+" ");
        }
    }
    static void armstrongNum(int num){
        int temp=num;
        int len=length(num);
        int sum=0;
        while(num>0){
            sum=sum+(int)Math.pow(num%10,len);
            num=num/10;
        }
        System.out.println(sum);
        if(temp==sum) 
            System.out.println("Armstrong number");

        else{
            System.out.println("Not a armstrong");
        }
    }
    static int length(int num){
        int len=0;
        while(num>0){
            len++;
            num=num/10;
        }
        return len;
    }

    static void stringPalin(String str){
        int start=0;
        int last=str.length()-1;
        while(start<last){
            if(str.charAt(start)==str.charAt(last)){
                start++;
                last--;
            }
            else{
                System.out.println("not a palindrome");
                return;
            }
        }
        System.out.println("palindrome");
    }

    static void reverseNumber(int num){
        int reverse=0;
        while(num>0){
            reverse=reverse*10;
            reverse+=num%10;
            num=num/10;
        }
        System.out.println(reverse);
    }

    static void leapYear(int year){
        if(year%400==0 || (year%4==0&& year%100!=0)){
            System.out.println("leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }


    static void primeInRange(int n){
        for(int i=0;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    static boolean isprime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    static void sumOfDigits(int num){
        int val=0;
        while(num>0){
            val+=num%10;
            num=num/10;
        }
        System.out.println(val);
    }
    static int sumOfDigitsRecursion(int num){
        if(num==0)
            return 0;
        return (num%10)+sumOfDigitsRecursion(num/10);
    }
}

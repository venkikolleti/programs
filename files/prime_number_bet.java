public class prime_number_bet {
    public static void main(String[] args){
        primenum(10,40);
    }

    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++)
            if(n%i==0)
                return false;
        
        return true;
        
    }
    

    public static void primenum(int x,int y) {
            for(int i=x;i<=y;i++){
                if(isPrime(i)){
                    System.out.print(i+" ");
                }
            }
    }






    }


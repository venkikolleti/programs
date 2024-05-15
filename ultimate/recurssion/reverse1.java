public class reverse1 {
    static void rever(int n){
        if(n<10){
            System.out.print(n);
            return;
        }
        System.out.print(n%10);
        rever(n/10);
    }
    public static void main(String args[]){
        rever(10323);

    }
}

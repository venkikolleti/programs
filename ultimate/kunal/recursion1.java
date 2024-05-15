public class recursion1 {
    public static void main(String args[]){
        message();
        display(1);
    }

    static void message(){
        System.out.println("hello world");
    }
    static void display(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        display(n+1);
    }
}

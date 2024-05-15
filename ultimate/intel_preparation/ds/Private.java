public class Private {
    public static void main(String args[]){
        account ac=new account();
        ac.deposit(12);
        ac.getBalance();
    }
}

class account{
    private int balance;

    public void deposit(int data){
        this.balance=data;
    }
    public void getBalance(){
        System.out.println(balance);
    }
}
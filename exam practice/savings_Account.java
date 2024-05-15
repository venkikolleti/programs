import java.util.Scanner;

class account {
    private static double annualinterest;
    private double savingsbalance1;
    private double savingsbalance2;
    private double monthlyrate1;
    private double monthlyrate2;



    account(double annualinterest){
        this.annualinterest=annualinterest;
        
        
    }
    account(double savingsbalance1,double savingsbalance2){
        this.savingsbalance1=savingsbalance1;
        this.savingsbalance2=savingsbalance2;

    }

    
    void calmonthlyinterest(){
        double monthlyrate1=(annualinterest+savingsbalance1)/12;
        double monthlyrate2=(annualinterest+savingsbalance2)/12;

        savingsbalance1=savingsbalance1+monthlyrate1;
        savingsbalance2=savingsbalance2+monthlyrate2;

    }

    static void modifyannualinterest(double interest){
        annualinterest=interest;
    }

    public void display(){
        System.out.println(savingsbalance1);
        System.out.println(savingsbalance2);
    }


}

public class savings_Account{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double x,y,z;
        System.out.println("enter the annual interest in percentage rate: ");
        x=sc.nextDouble();
        x=x/100;
        account per1=new account(x);
        System.out.println("enter the cuurrent saving account balances of two persons ");
        y=sc.nextDouble();
        z=sc.nextDouble();
        account bal=new account(y,z);
       
        
        bal.calmonthlyinterest();;
        bal.display();


        
    }
}

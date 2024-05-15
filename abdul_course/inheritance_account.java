import javax.xml.crypto.Data;

class account{
    private String accno;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected double balance;

    

    public account(String accno,String name,String address,String phno,String dob,double balance){
        this.accno=accno;
        this.name=name;
        this.address=address;
        this.phno=phno;
        this.dob=dob;
        this.balance=balance;
    }

    public String getaccno(){
        return accno;
    }
    public String getname(){
        return name;
    }
    public String getaddress(){
        return address;
    }

    public String getphno(){
        return phno;
    }
    public String getdob(){
        return dob;
    }
    public double getbalance(){
        return balance;
    }
    public void setaddress(String address){
        this.address=address;
    }
    public void setphno(String phno){
        this.phno=phno;
    }


}



class savingsaccount extends account{

    public savingsaccount(String accno,String name,String address,String phno,String dob,double balance){
        super(accno,name,address,phno,dob,balance);
    }
    public void deposit(double amt){
        balance+=amt;
    }

    public void withdraw(double amt){
        balance-=amt;
    }

}









public class inheritance_account {
    public static void main(String args[]){

        savingsaccount s=new savingsaccount("1234432","venki","rkvalley","9014307425","16-04-2004",2000);

        s.deposit(1200);
        System.out.println(s.getbalance());
        System.out.println(s.getaccno());
        System.out.println(s.getname());
        System.out.println(s.getaddress());
        System.out.println(s.getphno());
        System.out.println(s.getdob());

        s.setaddress("nuziveedu");
        System.out.println(s.getaddress());


    }
}

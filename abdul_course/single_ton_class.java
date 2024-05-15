class coffeemachine{
    private float coffeeqty;
    private float waterqty;
    static private coffeemachine our=null;
    private coffeemachine(){
        coffeeqty=1;
        waterqty=1;
    }
    static public coffeemachine getInstance(){
        if(our==null){
            our=new coffeemachine();
        }
        return our;
    }
}


public class single_ton_class{
    public static void main(String args[]){

        coffeemachine c1=coffeemachine.getInstance();
        coffeemachine c2=coffeemachine.getInstance();
        coffeemachine c3=coffeemachine.getInstance();

        System.out.println(c1+" "+c2+" "+c3);

        if(c1==c2 && c2==c3){
            System.out.println("same");
        }



    }
}
class c1{
    private int x;
    
    public c1(int x){
        setX(x);
        System.out.println("this is constructor");
    }
    public void setX(int x){
        if(x>=0){
            this.x=x;
            System.out.println(x);
        }
        else{
            this.x=0;
            System.out.println(x);
        }
    }
}



public class this_k {
    public static void main(String arg[]){
        System.out.println("kolleti");
        c1 obj=new c1(2);
        obj.setX(8);

    }
}

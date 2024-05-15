class sample2{
    private String name;
    void setName(String name){
        this.name=name;
        System.out.println("this is inside setname "+name);
    }
    void getName(){
        System.out.println("this is inside getname "+name);
    }

    String retName(){
        return name;
    }
}

public class encapsulation_2 {
    public static void main(String args[]){
        sample2 s1=new sample2();
        s1.setName("rkv");
        s1.getName();
        System.out.println("this is by return "+s1.retName());
    }
}

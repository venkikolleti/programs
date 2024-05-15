public class j3_constructors {
    public static void main(String args[]){

        con obj=new con("venki",18);
        obj.result();
    }
}

class con{
    private String name;
    private int age;

    public con(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void result(){
        System.out.println("your name "+name);
        System.out.println("your age "+age);
    }
}
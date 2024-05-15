public class overriding_toString {
    public static void main(String[] args) {
        random obj=new random();
        System.out.println(obj);
    }
}

class random{
    int a=10;
    int b=20;

    public String toString(){
        return " "+(a+b);
    }
}

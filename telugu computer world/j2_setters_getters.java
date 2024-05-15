import java.util.Scanner;

public class j2_setters_getters {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        sets obj=new sets();
        obj.setName(x);
        obj.result();
    }
}

class sets{
    private String name;
    public void setName(String Mname){
        name=Mname;
    }
    public String getName(){
        return name;
    }
    public void result(){
        System.out.println("final result is "+getName());
        System.out.printf("favourite movie is %S \n",getName());
        System.out.printf("favourite movie is %s \n",getName());
    }
}

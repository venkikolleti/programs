import java.util.*;

class sample1{
    int x;
    String a;
    private int z=20;
    class sample2{
        int m=100;
        public void sampMe(){
            System.out.println(z);
        }
    }
}


class sim1 {
    int id;
    String clas;
    sim1(int i,String cl){
        this.id=i;
        this.clas=cl;
    }
    public void myFirst(){
        System.out.println("my first method");
        
    }
      public static void main(String args[]){
        sim1 object1=new sim1(23,"csd");
        System.out.println(object1.id);
        System.out.println(object1.clas);

        object1.myFirst();
	
	System.out.println("kolleti");
        sample1 obj1=new sample1();
        System.out.println(obj1);
        System.out.println(obj1.x);

        sample1.sample2 obj2=obj1.new sample2();
        System.out.println(obj2.m);
        obj2.sampMe();
        

    }
}














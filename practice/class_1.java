 /*class class_2 {
    static int x=10;
    int y=20;
    private int z=100;
    class class_1{
        public void method1(){
            System.out.println(x);
            System.out.println(x);
        }
 
        
    }
    public static void main(String args[]){
        System.out.println("kollleti");
        System.out.println(x);

    }
    
}

*/





class class_2{
    int x;
    int y;
    String z;
    class_2(int x,int y,String z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public void display(){
        System.out.println(x+" "+y+" "+z+" ");
    }
    
}

class class_1{
public static void main(String args[]){
    class_2[] obj1=new class_2[3];
    obj1[0]=new class_2(10,20,"venk");
    obj1[1]=new class_2(100,202,"rgukt");
    obj1[2]=new class_2(10000,20000,"rgukt cse");
    obj1[0].display();
    obj1[1].display();
    obj1[2].display();

    
}
}

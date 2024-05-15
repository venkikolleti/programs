class Super{
    void display(){
        System.out.println("super class");
    }
}

class sub extends Super{
    void display(){
        //super.display();
        System.out.println("sub class");
    }
}


public class method_overriding {
    public static void main(String args[]){

        Super s=new Super();
        s.display();

        sub su=new sub();
        su.display();

        Super s1=new sub();
        s1.display();
        
    }
}

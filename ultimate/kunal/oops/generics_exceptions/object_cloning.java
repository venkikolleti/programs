

public class object_cloning {
    public static void main(String[] args) throws CloneNotSupportedException{
        human h1=new human("venki",19);
        //human h2=new human(h1);   insteadd of doing this 
        //System.out.println(h2);
        human h3=(human)h1.clone();
        System.out.println(h3);
    }
}


class human implements Cloneable{
    String name;
    int age;
    public human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public human(human other){
        this.name=other.name;
        this.age=other.age;
    }

    @Override
    public String toString() {
        return "human [name=" + name + ", age=" + age + "]";
    }
    
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
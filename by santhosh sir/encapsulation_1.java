
class sample1{

    sample1(){
        System.out.println("this is default constructor");
    }
    sample1(int a,int b){
        System.out.println("paramarised constructor \n sum is "+(a+b));
        
    }
    sample1(int a,String b){
        System.out.println("name is "+b+"\n age is "+a);
    }
}

public class encapsulation_1 {
    public static void main(String args[]){
        sample1 s1=new sample1();
        sample1 s2=new sample1(10,20);
        sample1 s3=new sample1(40,50);
        sample1 s4=new sample1(100,"venki");


    }   
}

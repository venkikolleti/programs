public class conversion_datatypes {
    public static void main(String args[]){
        byte b=10;
        short s=20;
        int i=30;
        long l=40;
        float f=10.5f;
        double d=20.5;

        short x=b;
        System.out.println(x);

        double m=f;
        System.out.println(m);

        float n=l;
        System.out.println(n);


        byte y=(byte)s;
        System.out.println(y);

        float z=(float)d;
        System.out.println(z);


        int a='A';
        System.out.println(a);

        char c=(char)97;
        System.out.println(c);


    }
}

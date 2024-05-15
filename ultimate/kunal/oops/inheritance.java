public class inheritance {
    public static void main(String[] args) {
        shape s=new shape(10, 22.10, 45);
        System.out.println(s.l+" "+s.h+" "+s.b);

        rect r=new rect(300);
        System.out.println(r.l+" "+r.h+" "+r.b+" "+r.length);

        rect r1=new rect(12,45);
        System.out.println(r1.l+" "+r1.h+" "+r1.b+" "+r1.length);
    }   
}

class shape{
    double l;
    double b;
    double h;
    shape(){
        l=-1;
        b=-1;
        h=-1;
    }
    shape(double len){
        this.l=len;
        this.b=len;
        this.h=len;
    }
    shape(double l,double b,double h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
}

class rect extends shape{
    double length;
    rect(double length){
        this.length=length;
    }
    rect(double l,double b,double h,double length){
        super(l,b,h);
        this.length=length;
    }
    rect(double len,double length){
        super(len);
        this.length=length;
    }
}
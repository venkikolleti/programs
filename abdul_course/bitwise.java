public class bitwise {
    public static void main(String args[]){
        int x=10,y=6,z,b=-10;
        z=x&y;
        System.out.println("X&Y: "+z);
        System.out.println("X|Y: "+(x|y));
        System.out.println("X^Y: "+(x^y));
        System.out.println("~X: "+(~x));

        System.out.println("X<<1: "+(x<<1));
        System.out.println("X>>Y: "+(x>>1));
        System.out.println("B>>1: "+(b>>1));
        System.out.println("B>>>1: "+(b>>>1));

        System.out.println(Integer.toBinaryString(x));



        
    }
}

import java.util.Scanner;

public class cuboid_area {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double length,breadth,height,volume,area;

        System.out.println("enter the length, breadth ,height of a cuboid: ");
        length=sc.nextDouble();
        breadth=sc.nextDouble();
        height=sc.nextDouble();

        area=2*(length*breadth+length*height+breadth*height);
        volume=length*breadth*height;

        System.out.println("area of cuboid: "+area);
        System.out.println("volume of cuboid: "+volume);

    }
}

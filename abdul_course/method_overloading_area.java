public class method_overloading_area {

    static double area(double x,double y){
        return x*y;
    }
    static double area(double radius){
        return 3.14*radius*radius;
    }
    public static void main(String args[]){

        System.out.println(area(22,54));
        System.out.println(area(54));
        System.out.println(area(12,84));



    }
}

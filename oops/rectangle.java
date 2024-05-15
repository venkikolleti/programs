import java.util.Scanner;

class rectangle_out{
    private double width;
    private double height;

    public rectangle_out(){
        this.width=1.0;
        this.height=1.0;
    }
    public rectangle_out(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return 2*(this.width+this.height);
    }
    public double getwidth(){
        return width;
    }
    public void setwidth(int width){
        this.width=width;
    }
    public double getheight(){
        return height;
    }
    public void getheight(double height){
        this.height=height;
    }


}



public class rectangle {
    public static void main(String args[]){

        rectangle_out[] rec=new rectangle_out[3];

        Scanner input=new Scanner(System.in);
        for(int i=0;i<rec.length;i++){
            System.out.println("do you want to enter the width and height (y/n)");
            char choice=input.next().charAt(0);

            if(choice=='y'){
                rec[i]=new rectangle_out(input.nextDouble(),input.nextDouble());
            }
            else{
                rec[i]=new rectangle_out();
            }
        }

        System.out.println("the rectangle are");
        for(int i=0;i<rec.length;i++){
            System.out.println("rectangle "+(i+1)+" width:"+rec[i].getwidth());
            System.out.println("rectangle "+(i+1)+" height:"+rec[i].getheight());
        }

    }
}

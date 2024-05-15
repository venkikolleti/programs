class rectangle{
    private int length;
    private int breadth;

    public rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public rectangle(){
        length=1;
        breadth=1;
    }

    public rectangle(int len){
        this.length=len;
        this.breadth=len;
    }

    public String toString(){
        return length+" "+breadth;
    }
}


public class array_of_objects {
    public static void main(String args[]){

        rectangle r=new rectangle();
        System.out.println(r);

        rectangle r1=new rectangle(10);
        System.out.println(r1);

        rectangle r2=new rectangle(20,30);
        System.out.println(r2);



        rectangle rec[]=new rectangle[3];

        rec[0]=new rectangle();
        rec[1]=new rectangle(100);
        rec[2]=new rectangle(200,300);

        for(rectangle x:rec){
            System.out.println(x);
        }



    }
}

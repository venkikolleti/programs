

public class n{

    public static void main(String[] args) {
        int x=20;
        System.out.println(x);
        int[] z={1,2,3};
        int[] y={1,2,3};
        if(z==y){
            System.out.println("same");
        }
        else{
            System.out.println("not smae");

        }
        int i=0,j=1,k=2,m;

        int count=0;
        while(true){
            if(count==10){
                break;
            }
            System.out.println(++count);
        }

    }
    static {
        int x=10;
        System.out.println(x);
    }
}

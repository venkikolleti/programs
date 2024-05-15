public class variable_arguments {
    static int max(int ...x){
        if(x.length==0)
            return Integer.MIN_VALUE;
        int maxi=x[0];
        for(int i=0;i<x.length;i++){
            if(x[i]>=maxi)
                maxi=x[i];
        }
        return maxi;
    }

    static int sum(int ...a){
        if(a.length==0)
            return 0;
        int sum=0;
        for(int i:a){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String args[]){
        System.out.println(max());
        System.out.println(max(10));
        System.out.println(max(12,34,543,23,22));
        System.out.println(max(43,87,23,89,2465,543,34));


        System.out.println();
        System.out.println();


        System.out.println(sum());
        System.out.println(sum(10,20,30));
        System.out.println(sum(100,200,300,400));



    }
}

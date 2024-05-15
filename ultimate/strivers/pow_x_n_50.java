public class pow_x_n_50{
    public static void main(String args[]){
        System.out.println(pow(2.000000,-));
    }

    static double pow(double x,int n){
        if(n==0){
            return 1;
        }
        else if(n==1){
            return x;
        }
        int nn=n;
        if(n<0) n=Math.abs(n);
        double ans=1;
        while(n>0){
            if(n%2==0){
                x=x*x;
                n=n/2;
            }
            else{
                ans=ans*x;
                n=n-1;
            }
        }
        if(nn<0) ans=(double)(1)/ans;
        return ans;
    }
}
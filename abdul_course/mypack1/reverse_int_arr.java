import java.util.*;
class reverse{

	static int rever(int num){
		int rev=0;
		while(num!=0){
			rev=rev*10+num%10;
			num=num/10;
		}
		return rev;
	}
	static void arrer(int num[]){
		int rev[]=new int[num.length];
		for(int i=num.length-1,j=0;i>=0;i--,j++){
			rev[j]=num[i];
		}
		for(int x:rev){
			System.out.println(x);
		}
	}
	
	public static void main(String args[]){
		System.out.println(rever(20345));
		int ar[]={1,2,3,4};
		arrer(ar);
		String[] x={"waa","sd"};

		Arrays.sort(x);
		
		for(String n:x){
			System.out.print(n+" ");
		}
	}

}

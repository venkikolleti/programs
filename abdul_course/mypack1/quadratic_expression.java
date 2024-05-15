import java.util.*;
class quadratic{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		double a=0,b=0,d=0;
		int j=0;
		for(int i=0;i<=ch.length;i++){
			j=i;
			//System.out.println(c);
			if(ch[i]!='x' && ch[++j]!='^'){
				System.out.println(ch[i]);
				a=a*10+(ch[i]%10);
				System.out.println(a);
				
			}

		}

		System.out.println(s);
		System.out.println(a);	
		//System.out.println(b);
		//System.out.println(d);
	}	
}

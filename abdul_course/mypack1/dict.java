import java.util.*;

class dict{

	public static void main(String args[]){
		
		String s="welcomejava";
	String str[]=new String[s.length()-2];
		System.out.println(s.length()-4);
		//System.out.println(s.substring(1,5));
		int k=3;
		for(int i=0;i<s.length()-2;i++){
		    	//str[i]=s.substring(i,3);
			//System.out.println(s.substring(i,k++));
			String n=s.substring(i,k++);
			str[i]=n;
			
		}
		
		for(String x:str){
			System.out.println(x);
		}
		Arrays.sort(str);
		for(String x:str){
			System.out.println(x);
		}
		System.out.println();
		System.out.println(str[0]);
		System.out.println(str[s.length()-3]);
	}
}

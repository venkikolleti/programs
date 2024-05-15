class gmail{
	public static void main(String args[]){
		String str="venkaiahkolleti@gmail.com";
if(str.matches("\\w*@gmail\\.[a-z]{3,}")){
		int i=str.indexOf('@');
		String str1=str.substring(0,i);
		String str2=str.substring(i,str.length());
		System.out.println(str1);
		System.out.println(str2);
}
else{
	System.out.println("not a valid gmail");
}	
	}
}

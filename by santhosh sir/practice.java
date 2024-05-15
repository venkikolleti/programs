class test{
	int data=10;
	String name="ravi";
/*
public test(int data,String name){
	this.data=data;
	this.name=name;
}

public test(int data,String name,float marks){
	this.data=data;
	this.name=name;
	this.marks=marks;
}

void chand(){
	System.out.println("rgukt");
}

int r1(int rem){
	return rem;
}
*/



}




class test2{
	void sum(){
		System.out.println("rayudu");
	}


}

class test3 extends test2{
	void sum(){
		System.out.println("nauyudyu");
	}
}



class Demo{
	public static void main(String args[]){
		test3 t=new test3();
		t.sum();	
		
	}
}

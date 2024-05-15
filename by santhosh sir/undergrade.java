abstract class Student{
	String name;
	String id;
	int age;
	double grade;
	String address;

	/*public Student(String name,String id,int age,double grade,String address){
		this.name=name;
		this.id=id;
		this.age=age;
		this.grade=grade;
		this.address=address;
	}*/
	abstract boolean isPassed(double marks);
}

class Undergrade extends Student{
	boolean isPassed(double marks){
		if(marks>70.0){
			return true;
		}
		else
			return false;
	}
}

class Grade extends Student{
	boolean isPassed(double marks){
		if(marks>80.0){
			return true;
		}
		else
			return false;
	}

}





class Demo{
	public static void main(String args[]){
		Undergrade u=new Undergrade();
		Grade g=new Grade();
		System.out.println(u.isPassed(71));
		System.out.println(u.isPassed(45));
		System.out.println(g.isPassed(85));
		System.out.println(g.isPassed(70));
		
	}

}

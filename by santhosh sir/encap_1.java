class course{
	private String courseName;
	private String courseId;
	private int courseDuration;

	void setcourseName(String courseName){
		this.courseName=courseName;
	}
	void setcourseId(String courseId){
		this.courseId=courseId;
	}
	void setcourseDuration(int courseDuration){
		this.courseDuration=courseDuration;
	}
	String getcourseName(){
		//System.out.println("Course name is "+courseName);
		return courseName;
	}
	String getcourseId(){
		//System.out.println("Courseid is "+courseId);
		return courseId;
	}
	int getcourseDuration(){
		//System.out.println("CourseDuration is "+courseDuration);
		return courseDuration;
	}
	
}


class encap_1{
	public static void main(String args[]){
		course c[]=new course[5];
		c[0]=new course();
		/*c[0].setcourseName("cse");
		c[0].setcourseId("R190636");
		c[0].setcourseDuration(6);
		System.out.println(c[0].getcourseName());
		c[0].getcourseId();
		c[0].getcourseDuration();

		*/
		for(int i=0;i<1;i++){
			c[i].setcourseName("cse");c[i].setcourseId("R190363");c[i].setcourseDuration(9);
		}
		for(int i=0;i<1;i++){
			System.out.println("Course name is "+c[i].getcourseName()+"\n"+"Courseid is "+c[i].getcourseId()+"\n"+"CourseDuration is "+c[i].getcourseDuration());
		}
	}
}




class Author{
	String name,email;
	char gender;
	public Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	String getName(){
		return this.name;
	}
	String getEmail(){
		return this.email;
	}
	char getGender(){
		return this.gender;
	}
	void setMail(String email){
		this.email=email;
	}
	void ToString(){
		System.out.println("AUthor[name= "+name+",Email= "+email+",gender= "+gender+"]");	
	}



}


class Test{
	public static void main(String args[]){
		Author a=new Author("kolleti","r190636@rguktrkv.ac.in",'M');
		a.ToString();

		a.setMail("venkaiahkvk146@gmail.com");
		a.ToString();

		System.out.println(a.getName());
	}

}


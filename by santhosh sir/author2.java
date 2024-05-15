class Author{
	String name;
	String email;
	char gender;
	public Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
		
	}

	String ToString(){
		return name+email+gender;
	} 
	
}

class Book {
	String name;	
	Author author;
	double price=0;
	int qty=0;
	
	public Book(String name,Author author,double price){
		this.name=name;
		this.author=author;
		this.price=price;
	}

	public Book(String name,Author author,double price,int qty){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
	}

	String ToString(){
		return name+author.email+author.name+author.gender+price+qty;
	}


}


class Test{
	public static void main(String args[]){
		Author obj=new Author("kolleti","r190636",'M');
		//String b="raju";
		//String c="esdfvfd";
		//char d='M';
		Book b=new Book("venki",new Author("kolleti","r190636",'M'),100.1,5);
		System.out.println(b.ToString());
	}

}


public class book {
    public static void main(String[] args) {
        Author a=new Author("rajuu", "rajuu123@gmail.com", 'M');
       Book b=new Book("Sciecnce", a, 10);
       System.out.println(b);
       System.out.println(b.getAuthor().getAuthorName());
        System.out.println(b.getAuthor().getAuthorEmail());

       
    }
}


class Author{
	private String name;
	private String email;
	private char gender;
	public Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
		
	}

    public String getAuthorName(){
        return name;
    }
    public String getAuthorEmail(){
        return email;
    }
    public char getAuthorGender(){
        return gender;
    }

	public String toString(){
		return name+" "+email+" "+gender;
	} 
	
}

class Book {
	private String name;	
	private Author author;
	private double price=0;
	private int qty=0;
	
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

    public String  getName(){
        return name;
    }

    public Author  getAuthor(){
        return author;
    }

    public double  getPrice(){
        return price;
    }

    public int  getQty(){
        return qty;
    }

    public void  setName(){
        this.name=name;
    }

    public void  setPrice(){
        this.price=price;
    }

    public void  setQty(){
        this.qty=qty;
    }


	public String toString(){
		return name+" {"+author.toString()+" }";
	}


}


public class Book {
	
	private String title;
	private Author author;
	private final String isbn;
	private int physicalCopies;
	private int availableCopies;
	private int timesRented;
	
	//constructor
	Book(String title,Author author, String isbn, int physicalCopies,
			int availableCopies, int timesRented){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.physicalCopies = physicalCopies;
		this.availableCopies = availableCopies;
		this.timesRented = timesRented;
	}
	
	public String toString(){
		return author.toString() +
				"\ntitle = " + this.title +
				"\nisbn = " + this.isbn +
				"\nphysicalCopies = " + this.physicalCopies +
				"\navailableCopies = " + this.availableCopies +
				"\ntimesRented = " + this.timesRented;
	}
	
	//getters, setters
	public void setTitle(String title){
		this.title = title;
	}
	public void setAuthor(Author author){
		this.author = author;
	}
	public void setAvailableCopies(int availableCopies){
		this.availableCopies = availableCopies;
	}
	public void setTimesRented(int timesRented){
		this.timesRented = timesRented;
	}
	
	public String getTitle(){
		return this.title;
	}
	public Author getAuthor(){
		return this.author;
	}
	public int getPhysicalCopies(){
		return this.physicalCopies;
	}
	public int getTimesRented(){
		return this.timesRented;
	}
	public int getAvailableCopies(){
		return this.availableCopies;
	}
	
	
	
	
	
	//methods
	public void rentPhysicalCopy(){
			if (this.availableCopies > 0){
				System.out.println("There is one or more copies of this book");
				this.availableCopies -=1;
				this.timesRented += 1;
			}else{
				System.out.println("There are no more copies of this book");
			}
		
	}
	
	public boolean isAvailable(){
		if (this.availableCopies > 0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean hasAuthor(String name){
		if (name.equals(this.author.getName())){
			return true;
		}else{
			return false;
		}
	}
	
}

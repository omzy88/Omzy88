
public class Library {
	
	private Book[] books = new Book[20];	
	
	Library(Book[] books){
		for(int i = 0; i<books.length; i++){
			this.books[i] = books[i];
		}
	}
	
	public void printAvailableBooks(){
		for(int i = 0; i<books.length; i++){
			if (this.books[i].isAvailable()){
				System.out.println(this.books[i].toString());
				System.out.println();
			}
		}
	}
	
	
	public void printBookDetails(String title){
		boolean temp = false;
		for(int i = 0; i<books.length; i++){
			if(this.books[i].getTitle().equals(title)){
				System.out.println(this.books[i].toString());
				System.out.println();
				temp=true;
			}
		}
			if (temp == false){
				System.out.println("book does not exist");
				System.out.println();
			}
		}
	
	
	public void printBookFromAuthor(String name){
		for(int i = 0; i<books.length; i++){
			if (this.books[i].getAuthor().getName().equals(name)){
				System.out.println(this.books[i].toString());
				System.out.println();
			}
		}
	}
	
}

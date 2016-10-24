
public class Author {
	
	private String name;
	
	//constructor
	Author(String name){
		this.name = name;
	}

	public String toString(){
		return "name = " + name;
	}
	
	//getters , setters
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
}


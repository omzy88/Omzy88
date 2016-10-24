

import java.util.ArrayList;

public class BootCampAdministration {

	//Create a private ArrayList with object of BootCampCandidates with name anArrayListOfBootCamps
	private ArrayList<BootCampCandidates> anArrayListOfBootcamps;
	
	//Create a constructor which receives an array with BootCampCandidate objects and 
	//initializes the anArrayListOfBootCamps ArrayList by adding all BootCampCandidate array's
	//elements in the the nArrayListOfBootCamps
	BootCampAdministration(BootCampCandidates[] arrayOfCandidates){
		anArrayListOfBootcamps = new ArrayList<>();
		for(int i = 0; i < arrayOfCandidates.length; i++){
			this.anArrayListOfBootcamps.add(arrayOfCandidates[i]);
		}
		
	}
	
	//Create setters and getters for BootCampAdministration
	public ArrayList<BootCampCandidates> getArrayList(){
		return this.anArrayListOfBootcamps;
	}
	public void setArrayList(ArrayList<BootCampCandidates> arrayOfCandidates){
		this.anArrayListOfBootcamps = arrayOfCandidates;
	}

	//create an int method that returns the size of anArrayListOfBootCamps
	public int sizeOfArray(){
		return this.anArrayListOfBootcamps.size();
	}
	
	//Create a method that adds a new BootCampCandidate inside the ArrayList
	public void addNewCandidate(BootCampCandidates candidate){
		this.anArrayListOfBootcamps.add(candidate);
	}
	
	//Create a method that removes a candidate by name and returns true if found or false if not
	//HINT: you have to use get() to get the object and equals to compare it
	public boolean removeCandidate(String name){
		for(int i = 0; i<anArrayListOfBootcamps.size(); i++){
			if ((anArrayListOfBootcamps.get(i).getName()).equals(name)){
				anArrayListOfBootcamps.remove(i);
				return true;
			}
		}
		return false;
	}
	
	//Create a method to search for a boot camp member by surname and returns a string with its information
	// if it's found and null if it's not found
	public String searchCandidate(String surname){
		for(int i = 0; i<anArrayListOfBootcamps.size();i++){
			if ((anArrayListOfBootcamps.get(i).getSurname()).equals(surname)){
				return anArrayListOfBootcamps.get(i).toString();
			}
		}
		return null;
	}
	
	
	
	//Create a method that can change a bootcampers age by having as input its name and surname
	public void changeAge(String name, String surname, int newage){
		for (int i = 0; i<anArrayListOfBootcamps.size();i++){
			if ((anArrayListOfBootcamps.get(i).getName()).equals(name)
			&& (anArrayListOfBootcamps.get(i).getSurname()).equals(surname)){
				anArrayListOfBootcamps.get(i).setAge(newage);
			}
		}
	}
	
}

/**
 * 
 */
package model;

import java.util.ArrayList;


/**
 * @author cw222kq
 *
 */
public class Member {

	/**
	 * 
	 */
	public Member(String name, String personalNO) {
		this.name = name;
		this.personalNO = personalNO;
		ID = getID();
	}
	public Member(){}
	public Member(Boat boat){}
	private String name;
	private String personalNO;
	private int ID;
	private int IDCounter;
	private int numberOfBoats = 0;
	ArrayList<Boat>listOfBoats = new ArrayList<Boat>();
	
	public void initialtID(){
		ID = 0;
		IDCounter = 0;
	}
	
	public void createNewMember(String name, String personalNO){
		this.name = name;
		this.personalNO = personalNO;
		ID = getID();
		IDCounter++;
	}
	public String getName(){
		return this.name;
	}
	public String getPersonalNO(){
		return this.personalNO;
	}
	
	public int getID(){
		return this.ID = IDCounter;
	}
	public int getNumberOfBoats(){
		for(int i=0; i<listOfBoats.size(); i++){
			if(listOfBoats.get(i)!=null){
				numberOfBoats++;
			}
		}
		return numberOfBoats;
	}
	public ArrayList<Boat> getMembersBoatInformation(){
		return listOfBoats;
	} 
	public void delete(){
		
	}
	public void changeInformation(String newName){
		this.name = newName;	
	}
	public void addBoat(String type, int length){
		Boat newBoat = new Boat(type,length);
		listOfBoats.add(newBoat);
	}
}

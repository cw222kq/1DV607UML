/**
 * 
 */
package model;

/**
 * @author cw222kq
 *
 */
public class Member {

	/**
	 * 
	 */
	public Member(String name, int personalNO) {
		this.name = name;
		this.personalNO = personalNO;
		ID = getID();
	}
	private String name;
	private int personalNO;
	private String ID;
	
	private String getID(){
		return "m_" + personalNO;
	}
	public void delete(){
		
	}
	public void changeInformation(String newName){
		this.name = newName;	
	}
	public Member showMembersInformation(){
		return null;
	}
}

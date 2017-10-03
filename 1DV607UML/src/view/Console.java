/**
 * 
 */
package view;

import java.util.ArrayList;

import model.Member;

/**
 * @author cw222kq
 *
 */
public class Console {

	/**
	 * 
	 */
	public Console() {
		// TODO Auto-generated constructor stub
	}

	boolean compactList = false;
	boolean verboseList = true;
	
	public void listAllMembers(ArrayList<Member>list){
		/*"Compact List" name, ID and number of boats*/
		if(compactList){
			for(int i=0; i<list.size();i++){
				System.out.println(list.get(i).getName() + " " + list.get(i).getID() + " " + list.get(i).getNumberOfBoats());
			}
		}
		/*"Verbose List" name, personal number, id and boats with boat information*/
		if(verboseList){
			for(int i=0; i<list.size();i++){
				System.out.println(list.get(i).getName() + " " + list.get(i).getPersonalNO() + " " + list.get(i).getMembersBoatInformation());
			}
		}
	}
}

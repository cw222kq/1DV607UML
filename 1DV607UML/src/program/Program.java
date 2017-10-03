/**
 * 
 */
package program;

import java.util.ArrayList;

import model.Boat;
import model.Member;
import view.Console;

/**
 * @author cw222kq
 */
public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Boat boat = new Boat();
		Member firstMember = new Member();
		firstMember.initialtID();
		firstMember.createNewMember("Amy Mcdonald", "890506-0988");
		firstMember.addBoat("motorBoat", 1000);
		firstMember.addBoat("sailBoat", 500);
		Member secondMember = new Member();
		secondMember.createNewMember("Andy Walberg", "891223-0999");
		secondMember.addBoat("sailBoat", 500);
		Console console = new Console();
		
		ArrayList<Member>listOfMembers = new ArrayList<Member>();
		listOfMembers.add(firstMember);
		listOfMembers.add(secondMember);
		
		console.listAllMembers(listOfMembers);
		
		
		
		

	}

}

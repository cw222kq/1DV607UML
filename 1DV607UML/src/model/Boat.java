/**
 * 
 */
package model;

/**
 * @author cw222kq
 *
 */
public class Boat {

	/**
	 * 
	 */
	public Boat() {
		// TODO Auto-generated constructor stub
	}
	public Boat(String type, int length){
		this.type = type;
		this.length =  length;	
	}
	
	private int length;
	private String type;
	
	public void delete(){
		
	}
	public void changeType(String type){
		this.type = type;
	}
	public void changeLength(int length){
		this.length = length;
	}
	public String getType(){
		return this.type;
	}
	public int getLength(){
		return this.length;
	}
	public String toString(){
		return "type: " + type + " length: " + length;
	}

}

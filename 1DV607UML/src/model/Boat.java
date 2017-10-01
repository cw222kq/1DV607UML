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
	private enum Type {
		sailboat,
		motorsailer,
		kayakOrCanoe,
		other
		
	}
	private int length;
	private Type type;
	
	public void register(Type type,int length){
		this.type = type;
		this.length =  length;
		
	}
	public void delete(){
		
	}
	public void changeType(Type type){
		this.type = type;
	}
	public void changeLength(int length){
		this.length = length;
	}

}

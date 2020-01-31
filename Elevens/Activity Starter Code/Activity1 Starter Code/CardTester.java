/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c1 = new Card("A","Spades",1);
		Card c2 = new Card("K","Spades",13);
		Card c3 = new Card("A","Spades",1);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		if(c1.matches(c3)){
		    System.out.println("c1 matches c3");
		  }else{
		  System.out.println("c1 doesn't match c3");
		  }
		if(c1.matches(c2)){
		    System.out.println("c1 matches c2");
		  }else{
		  System.out.println("c1 doesn't match c2");
		  }
		  
	}
}

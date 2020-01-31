/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks ={"A","B","C"};
        String[] suits = {"Square","Circle"};
        int[] pV ={1,2,3};
        Deck d1 = new Deck(ranks,suits,pV);
        
    }
}

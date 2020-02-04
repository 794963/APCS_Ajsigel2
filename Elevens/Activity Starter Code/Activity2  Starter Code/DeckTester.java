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
        String[] ranks2 ={"D","E","F"};
        String[] suits2 = {"S","C"};
        int[] pV2 ={4,5,6};
        Deck d2 = new Deck(ranks2,suits2,pV2);
        String[] ranks3 ={"G","H","I"};
        String[] suits3 = {"B","A"};
        int[] pV3 ={7,8,9};
        Deck d3 = new Deck(ranks3,suits3,pV3);
        
    }
}

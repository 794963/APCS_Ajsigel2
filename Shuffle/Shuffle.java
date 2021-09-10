
/**
 * Shuffles
 *
 * @author (Jaan Sigel)
 * @version (2020)
 */
import java.util.*;
public class Shuffle
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Shuffle
     */
    public Shuffle(int[] s)
    {
        // initialise instance variables
        int rand = 0;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        ArrayList<Integer> fin = new ArrayList<Integer>();
        for( int i=0; i<52;i++){
        temp.add(s[i]);
    }
    System.out.println(temp);
    for(int i=0; i<52;i++){
        rand =(int)(Math.random()*temp.size());
        fin.add(temp.get(rand));
        temp.remove(rand);
    }
    System.out.println(fin);
    }

    public static void main(){
    int[] nums =  new int[52];
    for( int i=0; i<52;i++){
        nums[i]=i+1;
        
    }
    Shuffle s = new Shuffle(nums);
    }
}

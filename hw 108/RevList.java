
/**
 * Reverses list
 *
 * @author (Jaan Sigel)
 * @version (1/08)
 */
import java.util.*;
public class RevList
{
    // instance variables - replace the example below with your own
    private ArrayList<String> sl = new ArrayList<String>();
    private ArrayList<String> rl = new ArrayList<String>();
    

    /**
     * Constructor for objects of class RevList
     */
    public RevList()
    {
        sl.add("one");
        sl.add("two");
        sl.add("three");
        System.out.println(sl);
        rl = revList();
        System.out.println(rl);
    }
    
    public ArrayList<String> revList(){
    ArrayList<String> temp = new ArrayList<String>();   
    for(int i=0; i<sl.size();i++){
    temp.add(0,sl.get(i));
    }
    return temp;
    }
    public static void main(){
    RevList r = new RevList();
    }
}


/**
 * Reverses list
 *
 * @author (Jaan Sigel)
 * @version (1/08)
 */

public class RevArr
{
    // instance variables - replace the example below with your own
    private String[] sa = new String[3];
    private String[] ra = new String[3];
    

    /**
     * Constructor for objects of class RevArr
     */
    public RevArr()
    {
        sa[0] = "one";
        sa[1] = "two";
        sa[2] = "three";
        for(int i=0; i<sa.length;i++){
    System.out.print(sa[i]);
    }
        System.out.println();
        ra = revList();
        for(int i=0; i<sa.length;i++){
    System.out.print(ra[i]);
    }
    }
    
    public String[] revList(){
    String[] temp = new String[3]; 
    for(int i=0; i<sa.length;i++){
    temp[temp.length-1-i]= sa[i];
    }
    return temp;
    }
    public static void main(){
    RevArr r = new RevArr();
    }
}

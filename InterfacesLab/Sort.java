//© A+ Computer Science
// www.apluscompsci.com

//sort example using an array of Comparable

import static java.lang.System.*;
import java.util.Arrays;

public class Sort
{
    public static void main ( String[] args )
    {
        Comparable[] creatureList = new Creature[3];
        //add 3 creatures to creatureList
        Creature a = new Creature(2);
        Creature b = new Creature(3);
        Creature c = new Creature(22);
        creatureList[0]=a;
        creatureList[1]=b;
        creatureList[2]=c;

    
        
        
        Arrays.sort(creatureList);          //will throw an exception until
                                                            //creatures are added to the array      
        
        for(Comparable it : creatureList)
        {
            out.println(it);
        }       
  }
}
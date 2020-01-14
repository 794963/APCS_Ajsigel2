//© A+ Computer Science
// www.apluscompsci.com

//comparable example one

import static java.lang.System.*;
import java.util.*;
public class WordRunner
{
	public static void main ( String[] args )
	{
		Word x = new Word("dog");
		Word y = new Word("cat");
		System.out.println( x.compareTo(y) );
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("wall");
		al.add("ball");
		Collections.sort(al);
		System.out.println(al);
		//make a list of Word
		//call Collections.sort() and sort the list
		//print the list
  }
}
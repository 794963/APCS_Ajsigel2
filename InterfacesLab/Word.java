//© A+ Computer Science
// www.apluscompsci.com

//generic comparable example

public class Word implements Comparable<Word>
{
  private String orig;

  public Word(String s) { orig = s; };

  public int compareTo(Word other) 
  {

     
     if(size>other.toString())
       return 1;
     else if(size<other.size) 
       return -1;
     return 0;
     return 1; 
  }

  public String toString() { return orig; }
}

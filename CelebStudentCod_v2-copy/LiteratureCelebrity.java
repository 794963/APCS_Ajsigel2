
/**
 * Write a description of class SportCelebrity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LiteratureCelebrity extends Celebrity
{


    
	/**
	 * Creates a Celebrity instance with the supplied answer and clue
	 * @param answer
	 * @param clue
	 */
	public LiteratureCelebrity(String answer, String clue)
	{
	    super(answer,clue);
	}
	

	/**
	 * Supplies the clue for the celebrity
	 * @return
	 */
	public String getClue()
	{
		return clue;
	}

	/**
	 * Supplies the answer for the celebrity.
	 * @return
	 */
	public String getAnswer()
	{
		return answer;
	}
	
	/**
	 * Provides a String representation of the Celebrity.
	 */
	@Override
	public String toString()
	{
		return answer + ": " + clue;
	}
	
}


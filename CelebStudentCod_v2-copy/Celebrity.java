
/**
 * Write a description of class Celebrity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Celebrity
{
    /**
	 * The clue to determine the celebrity
	 */
	String clue;
	/**
	 * The answer or name of the celebrity.
	 */
	String answer;
	/**
	 * Creates a Celebrity instance with the supplied answer and clue
	 * @param answer
	 * @param clue
	 */
	public Celebrity(String answer, String clue)
	{
	    this.answer=answer;
	    this.clue=clue;
	}
	public Celebrity()
	{
	    this.answer="";
	    this.clue="";
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
	 * Updates the clue to the provided String.
	 * @param clue The new clue.
	 */
	public void setClue(String clue)
	{
		this.clue=clue;
	}

	/**
	 * Updates the answer to the provided String.
	 * @param answer The new answer.
	 */
	public void setAnswer(String answer)
	{
		this.answer=answer;
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

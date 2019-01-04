package game.dice;

import java.util.ArrayList;
import java.util.List;

/**
 * a die with any chosen amound of sides.
 * @author Carl
 * @version 01/04/19
 */
public class NumberedDie implements Rollable
{
	private Integer sides;
	
	public NumberedDie(Integer sides)
	{
		this.sides = sides;
	}
	
	/**
	 * Rolls a number between (inclusive) 1 and sides.
	 * @return a single integer containing a number between 1 and sides.
	 */
	public List<Integer> roll()
	{
		List<Integer> roll = new ArrayList<Integer>();
		Integer value = (int) ((Math.random() * sides) + 1);
		roll.add(value);
		return roll;
	}
}

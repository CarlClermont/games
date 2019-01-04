package game.dice;

import java.util.List;

/**
 * Basically an interface for dice.
 * @author Carl
 * @version 01/04/19
 *
 */
public interface Rollable 
{
	/**
	 * has a list returned because there can be collections of die.
	 * @return a list of rolls. if only one die, return a single integer.
	 */
	public List<Integer> roll(); 
}

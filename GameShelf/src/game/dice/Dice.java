package game.dice;

import java.util.ArrayList;
import java.util.List;
/**
 * A collection of die.
 * @author Carl
 * @version 01/04/19
 */
public class Dice implements Rollable
{
	private List<Rollable> dice;
	
	public Dice(List<Rollable> dice)
	{
		this.dice = dice;
	}
	
	/**
	 * adds a die to the list.
	 * @param die - the di(c)e to add.
	 */
	public void addDie(Rollable die)
	{
		dice.add(die);
	}
	
	/**
	 * removes said die if there is more than 1.
	 * @param die - the die to remove
	 * @return true if succesfully removed a die. false otherwise.
	 */
	public boolean removeDie(Rollable die)
	{
		return (dice.size() > 1) ? dice.remove(die) : false;
	}
	
	@Override
	public List<Integer> roll() {
		List<Integer> roll = new ArrayList<Integer>();
		for(Rollable die : dice)
		{
			roll.addAll(die.roll());
		}
		return roll;
	}

}

package game.dice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Handles the rolling of dice and adding them up to one integer;
 * @author Carl
 *
 */
public class AddedRoller implements DiceParser
{
	private int rollValue;
	private Dice dice;
	
	/**
	 * Makes dice out of the <sides, amount> map. and rolls preemtively to set rollValue.
	 * @param diceTypes - a map of dice. key is # of sides and value is # of dice of that type.
	 */
	public AddedRoller(Map<Integer, Integer> diceTypes)
	{
		Dice dice;
		List<Rollable> numberedDie = new ArrayList<Rollable>();
		for(Integer i : diceTypes.keySet())
		{
			for(int j = 0 ; j < diceTypes.get(i); j++)
			{
				numberedDie.add(new NumberedDie(i));
			}
		}
		this.dice = new Dice(numberedDie);
		rollValue = 0;
//		roll();
	}
	
	/**
	 * adds all the dice together.
	 * @return - the sum of all the dice.
	 */
	public int roll()
	{
		List<Integer> values = dice.roll();
		rollValue = 0;
		for(Integer v : values)
		{
			rollValue += v;
		}
		return rollValue;
	}
	
	/**
	 * Retrieves the latest roll.
	 * @return - returns the value of the most recent roll.
	 */
	public int getLatestRollValue()
	{
		return rollValue;
	}
}

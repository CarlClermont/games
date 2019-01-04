package game.dice.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import game.dice.Dice;
import game.dice.NumberedDie;
import game.dice.Rollable;

/**
 * Test for the collection of Rollables called dice.
 * @author Carl
 * @version 01/04/19
 */
class DiceTest 
{

	@Test
	void testBetweenNandNX() {
		List<Rollable> list = new ArrayList<Rollable>();
		int x = 6;
		int n = 3;
		for(int j = 0 ; j < n ; j++)
		{
			NumberedDie die = new NumberedDie(x);
			list.add(die);
		}
		
		Dice dice = new Dice(list);
		List<Integer> rolls = new ArrayList<Integer>();
		boolean between = true;
		int sum = 0;
		rolls = dice.roll();
		for(Integer i : rolls)
		{
			if(i < 1 ||i > x)
			{
				between = false;
			}
			sum += i;
//			System.out.println(i);
		}
		boolean betweenNAndNX = (sum >= list.size() && sum <= list.size()*x);
		assertTrue(between);
		assertTrue(betweenNAndNX);
	}

}

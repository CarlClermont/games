package game.dice.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import game.dice.NumberedDie;
import game.dice.Rollable;

class NumberedDieTest {

	@Test
	void testBetween1AndX() 
	{
		int x = 10;
		Rollable die = new NumberedDie(x);
		int roll = die.roll().get(0);
		boolean between = (roll >= 1 && roll <= x);
//		System.out.println(roll);
		assertTrue(between);	
	}

}

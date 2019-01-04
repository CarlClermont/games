package game.dice.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import game.dice.AddedRoller;
import game.dice.DiceParser;

class AddedRollerTest {

	@Test
	void testRoll() {
		Map<Integer, Integer> diceMap = new HashMap<Integer, Integer>();
		diceMap.put(6, 2);
		diceMap.put(20, 1);
		AddedRoller added = new AddedRoller(diceMap);
		int rollValue = added.roll();
		System.out.println(rollValue);
		boolean between = (rollValue > 3 && rollValue < 32);
		assertTrue(between);
		
	}

}

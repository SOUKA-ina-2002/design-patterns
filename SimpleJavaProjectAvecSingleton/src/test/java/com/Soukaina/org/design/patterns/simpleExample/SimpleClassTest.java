package com.Soukaina.org.design.patterns.simpleExample;

import com.Soukaina.org.design.patterns.simpleExample.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SimpleClassTest {

	@Test
	public void testAddtion() {

		SimpleClass simpleClass = new SimpleClass();

		int additionResult = simpleClass.add(2, 5);

		assertEquals(7, additionResult);

	}

}

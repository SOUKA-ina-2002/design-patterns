package com.Soukaina.org.design.patterns.simpleExample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class singletonTest {

	@Test
	public void testGetInstance() {
		// Vérifier que getInstance renvoie la même instance
		assertEquals(singleton.getInstance(), singleton.getInstance());
	}

	@Test
	public void testIncrementCounter() {
		// Créer une instance de Counter
		singleton counter = singleton.getInstance();

		// Vérifier que le compteur est initialisé à 0
		assertEquals(0, counter.getCount());

		// Incrémenter le compteur et vérifier qu'il est augmenté de 1
		counter.increment();
		assertEquals(1, counter.getCount());
	}

}

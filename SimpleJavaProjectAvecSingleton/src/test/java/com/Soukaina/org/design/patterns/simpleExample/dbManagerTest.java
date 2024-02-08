package com.Soukaina.org.design.patterns.simpleExample;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class dbManagerTest {

    public void testgetInstace() {

        assertEquals(dbManager.getInstance(), dbManager.getInstance());

    }
}

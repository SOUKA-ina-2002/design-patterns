package com.Soukaina.org.design.patterns.Singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class dbManagerTest {

    public void testgetInstace() {

        assertEquals(dbManager.getInstance(), dbManager.getInstance());

    }
}

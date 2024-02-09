package com.Soukaina.org.design.patterns.Singleton;

public class dbManager {
    // constructeur
    private dbManager() {
    }

    // instance
    private static dbManager instance;

    // methode statique

    public static dbManager getInstance() {
        if (instance == null)
            instance = new dbManager();
        return instance;

    }
}

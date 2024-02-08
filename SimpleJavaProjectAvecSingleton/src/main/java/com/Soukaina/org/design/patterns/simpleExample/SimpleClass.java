package com.Soukaina.org.design.patterns.simpleExample;

public class singleton {
    // Étape 1 : Définir un constructeur privé
    private singleton() {
        // Constructeur privé pour empêcher l'instanciation en dehors de cette classe
    }

    // Étape 2 : Déclarer une instance statique privée
    private static singleton instance;

    // Propriété pour stocker la valeur du compteur
    private int count = 0;

    // Étape 3 : Définir une méthode statique publique pour l'accès à l'instance unique
    public static singleton getInstance() {
        // Vérifier si une instance existe déjà
        if (instance == null) {
            // Si aucune instance n'existe, en créer une nouvelle
            instance = new singleton();
        }
        // Retourner l'instance unique
        return instance;
    }

    // Méthode pour incrémenter le compteur
    public void increment() {
        count++;
    }

    // Méthode pour obtenir la valeur actuelle du compteur
    public int getCount() {
        return count;
    }
}

package main.java.com.Soukaina.org.design.patterns.Strategy;


// Interface définissant le comportement commun à toutes les stratégies de compression d'image
public interface CompressionStrategy {
    void compress(String fileName);
}

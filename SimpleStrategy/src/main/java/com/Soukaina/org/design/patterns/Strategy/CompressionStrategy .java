package main.java.com.Soukaina.org.design.patterns.Strategy;

// Interface définissant le comportement commun à toutes les stratégies de compression d'image
public interface CompressionStrategy {
    void compress(String fileName);
}

// Stratégie de compression JPEG
class JPEGCompression implements CompressionStrategy {
    @Override
    public void compress(String fileName) {
        System.out.println("Compression de " + fileName + " en format JPEG");
    }
}

// Stratégie de compression PNG
class PNGCompression implements CompressionStrategy {
    @Override
    public void compress(String fileName) {
        System.out.println("Compression de " + fileName + " en format PNG");
    }
}

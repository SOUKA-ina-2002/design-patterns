package main.java.com.Soukaina.org.design.patterns.Strategy;

// Stratégie de compression JPEG
public class JPEGCompression implements CompressionStrategy {
    @Override
    public void compress(String fileName) {
        System.out.println("Compression de " + fileName + " en format JPEG");
    }
}

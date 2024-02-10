package com.Soukaina.org.design.patterns.Strategy;
import com.Soukaina.org.design.patterns.Strategy.CompressionStrategy;

// Classe contexte qui utilise une stratégie de compression
public class ImageStorage {
    private CompressionStrategy compressionStrategy;

    public void setCompressionStrategy(CompressionStrategy newcompressionStrategy) {
        this.compressionStrategy = newcompressionStrategy;
    }

    public void storeImage(String fileName) {
        // Compression de l'image en utilisant la stratégie appropriée
        compressionStrategy.compress(fileName);
        // Autres opérations de stockage de l'image
    }
}


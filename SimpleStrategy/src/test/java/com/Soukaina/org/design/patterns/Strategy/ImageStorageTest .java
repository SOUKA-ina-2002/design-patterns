package test.java.com.Soukaina.org.design.patterns.Strategy;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ImageStorageTest {
   
    @Test
	public void testImageCompression() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Création d'une instance de ImageStorage
        ImageStorage imageStorage = new ImageStorage();

        // Configuration de la stratégie de compression JPEG
        imageStorage.setCompressionStrategy(new JPEGCompression());
        
        // Appel à la méthode de stockage d'image avec un fichier
        imageStorage.storeImage("image1.jpg");

        // Vérification que le message affiché est correct
        assertEquals("Compression de image1.jpg en format JPEG\n", outContent.toString());
    }
}

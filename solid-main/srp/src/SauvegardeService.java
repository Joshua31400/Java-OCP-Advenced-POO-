import java.io.FileWriter;
import java.io.IOException;

public class SauvegardeService {
    /**
     * Sauvegarde un document dans son fichier correspondant.
     */
    public void sauvegarder(Document document) {
        try (FileWriter writer = new FileWriter(document.getNomFichier(), true)) {
            writer.write(document.getLigneSauvegarde());
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde du document : " + e.getMessage());
        }
    }
}

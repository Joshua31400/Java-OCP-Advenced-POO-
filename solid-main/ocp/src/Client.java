public interface Client {
    /**
     * Applique la remise spécifique au type de client.
     */
    double appliquerRemise(double montant);
    /**
     * Retourne le nom du type de client pour l'affichage.
     */
    String getNom();
}

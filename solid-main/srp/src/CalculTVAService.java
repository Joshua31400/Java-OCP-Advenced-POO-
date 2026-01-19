public class CalculTVAService {
    private static final double TAUX_TVA = 0.2;
    /**
     * Calcule et applique la TVA sur un document.
     */
    public void calculerTVA(Document document) {
        double tva = document.getMontantHT() * TAUX_TVA;
        double totalTTC = document.getMontantHT() + tva;

        document.setTva(tva);
        document.setTotalTTC(totalTTC);
    }

    public double getTauxTVA() {
        return TAUX_TVA;
    }
}

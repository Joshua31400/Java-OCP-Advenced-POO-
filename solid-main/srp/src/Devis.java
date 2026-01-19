public class Devis extends Document {
    private static final int VALIDITE_JOURS = 30;

    public Devis(double montantHT) {
        super(montantHT);
    }

    public int getValiditeJours() {
        return VALIDITE_JOURS;
    }

    @Override
    public String getType() {
        return "DEVIS";
    }

    @Override
    public String getAffichage() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n--- DEVIS ---\n");
        sb.append("Date : ").append(date).append("\n");
        sb.append("Montant HT : ").append(montantHT).append("\n");
        sb.append("TVA : ").append(tva).append("\n");
        sb.append("Total TTC : ").append(totalTTC).append("\n");
        sb.append("Valable ").append(VALIDITE_JOURS).append(" jours");
        return sb.toString();
    }

    @Override
    public String getLigneSauvegarde() {
        return "DEVIS | " + date
                + " | HT=" + montantHT
                + " | TVA=" + tva
                + " | TTC=" + totalTTC
                + " | validite=" + VALIDITE_JOURS + "j\n";
    }

    @Override
    public String getNomFichier() {
        return "devis.txt";
    }
}

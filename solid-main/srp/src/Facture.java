public class Facture extends Document {
    private String clientName;

    public Facture(double montantHT, String clientName) {
        super(montantHT);
        this.clientName = clientName;
    }

    public String getClientName() {
        return clientName;
    }

    @Override
    public String getType() {
        return "FACTURE";
    }

    @Override
    public String getAffichage() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n--- FACTURE ---\n");
        sb.append("Date : ").append(date).append("\n");
        sb.append("Client : ").append(clientName).append("\n");
        sb.append("Montant HT : ").append(montantHT).append("\n");
        sb.append("TVA : ").append(tva).append("\n");
        sb.append("Total TTC : ").append(totalTTC);
        return sb.toString();
    }

    @Override
    public String getLigneSauvegarde() {
        return "FACTURE | " + date
                + " | Client=" + clientName
                + " | HT=" + montantHT
                + " | TVA=" + tva
                + " | TTC=" + totalTTC + "\n";
    }

    @Override
    public String getNomFichier() {
        return "factures.txt";
    }
}

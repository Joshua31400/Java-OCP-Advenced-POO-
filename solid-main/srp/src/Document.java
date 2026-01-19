import java.time.LocalDate;

/**
 * Classe abstraite représentant un document (facture ou devis).
 */
public abstract class Document {
    protected double montantHT;
    protected double tva;
    protected double totalTTC;
    protected LocalDate date;

    public Document(double montantHT) {
        this.montantHT = montantHT;
        this.date = LocalDate.now();
    }

    public double getMontantHT() {
        return montantHT;
    }
    public double getTva() {
        return tva;
    }
    public double getTotalTTC() {
        return totalTTC;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }
    public void setTotalTTC(double totalTTC) {
        this.totalTTC = totalTTC;
    }

    public abstract String getType();
    public abstract String getAffichage();
    public abstract String getLigneSauvegarde();
    public abstract String getNomFichier();
}

public class ClientEtudiant implements Client {

    private static final double TAUX_REMISE = 0.10;

    @Override
    public double appliquerRemise(double montant) {
        return montant * (1 - TAUX_REMISE); // 10% de remise
    }

    @Override
    public String getNom() {
        return "Client Étudiant";
    }
}

public class ClientVIP implements Client {

    private static final double TAUX_REMISE = 0.20;

    @Override
    public double appliquerRemise(double montant) {
        return montant * (1 - TAUX_REMISE); // 20% de remise
    }

    @Override
    public String getNom() {
        return "Client VIP";
    }
}

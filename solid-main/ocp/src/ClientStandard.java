public class ClientStandard implements Client {

    @Override
    public double appliquerRemise(double montant) {
        return montant; // Pas de remise
    }

    @Override
    public String getNom() {
        return "Client Standard";
    }
}

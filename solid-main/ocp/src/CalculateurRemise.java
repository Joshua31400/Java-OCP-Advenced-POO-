public class CalculateurRemise {
    /**
     * Calcule le total après remise en utilisant le polymorphisme.
     */
    public double calculerTotal(Client client, double montant) {
        return client.appliquerRemise(montant);
    }
}

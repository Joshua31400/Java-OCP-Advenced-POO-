public abstract class CompteBancaire implements Deposable {

    protected double solde = 100;

    public double getSolde() {
        return solde;
    }

    @Override
    public void deposer(double montant) {
        solde += montant;
        System.out.println("Dépôt effectué. Nouveau solde : " + solde);
    }
}

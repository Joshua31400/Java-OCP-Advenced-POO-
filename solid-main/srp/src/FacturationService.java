public class FacturationService {

    private final CalculTVAService calculTVAService;
    private final AffichageService affichageService;
    private final SauvegardeService sauvegardeService;

    public FacturationService() {
        this.calculTVAService = new CalculTVAService();
        this.affichageService = new AffichageService();
        this.sauvegardeService = new SauvegardeService();
    }

    /**
     * Crée une facture avec calcul TVA, affichage et sauvegarde.
     */
    public void creerFacture(double montantHT, String clientName) {
        Facture facture = new Facture(montantHT, clientName);
        traiterDocument(facture);
    }

    /**
     * Crée un devis avec calcul TVA, affichage et sauvegarde.
     */
    public void creerDevis(double montantHT) {
        Devis devis = new Devis(montantHT);
        traiterDocument(devis);
    }

    /**
     * Traitement générique d'un document (calcul, affichage, sauvegarde).
     */
    private void traiterDocument(Document document) {
        calculTVAService.calculerTVA(document);
        affichageService.afficher(document);
        sauvegardeService.sauvegarder(document);
    }
}

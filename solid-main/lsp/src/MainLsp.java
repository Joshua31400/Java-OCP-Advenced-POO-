import java.util.Scanner;

public class MainLsp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CompteBancaire compte = choisirCompte(scanner);

        System.out.print("Montant à retirer : ");
        double montant = lireDouble(scanner);

        // On vérifie si le compte permet les retraits grâce à l'interface
        if (compte instanceof Retirable) {
            ((Retirable) compte).retirer(montant);
        } else {
            System.out.println("Ce type de compte ne permet pas les retraits.");
        }

        scanner.close();
    }

    private static CompteBancaire choisirCompte(Scanner scanner) {
        System.out.println("\n--- TYPE DE COMPTE ---");
        System.out.println("1. Compte courant");
        System.out.println("2. PEL");
        System.out.print("Choix : ");

        int choix = lireEntier(scanner);

        if (choix == 2) {
            return new PEL();
        }
        return new CompteCourant();
    }

    private static int lireEntier(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrée invalide : ");
            }
        }
    }

    private static double lireDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrée invalide : ");
            }
        }
    }
}

import java.util.Scanner;

public class MainIsp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Imprimer");
            System.out.println("2. Scanner");
            System.out.println("3. Faxer");
            System.out.println("0. Quitter");
            System.out.print("Choix fonctionnalité : ");

            int fonction = lireEntier(scanner);
            if (fonction == 0) break;

            System.out.println("\nChoisir la machine :");
            System.out.println("1. Imprimante simple");
            System.out.println("2. Imprimante multifonction");
            System.out.print("Choix machine : ");

            int machineChoisie = lireEntier(scanner);

            Printable machine;
            if (machineChoisie == 2) {
                machine = new ImprimanteMultifonction();
            } else {
                machine = new ImprimanteSimple();
            }

            executerFonction(machine, fonction);
        }

        scanner.close();
    }

    private static void executerFonction(Printable machine, int fonction) {
        switch (fonction) {
            case 1:
                machine.print();
                break;
            case 2:
                if (machine instanceof Scannable) {
                    ((Scannable) machine).scan();
                } else {
                    System.out.println("Cette machine ne peut pas scanner.");
                }
                break;
            case 3:
                if (machine instanceof Faxable) {
                    ((Faxable) machine).fax();
                } else {
                    System.out.println("Cette machine ne peut pas faxer.");
                }
                break;
            default:
                System.out.println("Fonction inconnue");
        }
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
}

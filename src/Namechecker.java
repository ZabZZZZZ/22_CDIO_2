import java.util.Scanner;

public class Namechecker {
    public static void checkName(String p1, String p2) {
        Scanner scanner = new Scanner(System.in);
        boolean isNameSame = true;
        
        while (isNameSame) {
            System.out.print("Spiller 1, indtast dit navn: ");
            p1 = scanner.nextLine();

            System.out.print("Spiller 2, indtast dit navn: ");
            p2 = scanner.nextLine();

            if (p1.isEmpty() || p2.isEmpty()) {
                System.out.println("Spillerne skal have et navn. Prøv igen.");
            }
            else if (p1.equals(p2)) {
                System.out.println("Spillernavne kan ikke være ens. Prøv igen.");
            }
            else {
                isNameSame = false;
            }
        }

        System.out.println("Spiller 1 er " + p1 + " og spiller 2 er " + p2);
        scanner.close();
    }
}


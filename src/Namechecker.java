import java.util.Scanner;

class Namechecker {
    public static String checkName(int n, Scanner s) {
        boolean isNameEmpty = true;
        var p = "";
        
        System.out.print("Spiller " + n + ", indtast dit navn: ");
        
        while (isNameEmpty) {
            p = s.nextLine();

            if (p.isEmpty() == false) {
                break;
            }

            System.out.println("Spilleren skal have et navn. Prøv igen.");
        }
        return p;
    }
}


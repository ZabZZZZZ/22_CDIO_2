import java.util.Scanner;

public class Namechecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Spiller 1, indtast dit navn: ");
        String player1Name = scanner.nextLine();

        
        System.out.print("Spiller 2, indtast dit navn: ");
        String player2Name = scanner.nextLine();

        
        if (player1Name.equals(player2Name)) {
            System.out.println("Spillernavne kan ikke være ens. Prøv igen.");
        } else {
            System.out.println("Spillet kan begynde med spillere " + player1Name + " og " + player2Name + "!");
        }

        scanner.close();
    }
}


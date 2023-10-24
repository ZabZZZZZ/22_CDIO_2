public class App {
    public static void main(String[] args) throws Exception {
        Introduktion.intro();

        String player1Name = "";
        String player2Name = "";

        Namechecker.checkName(player1Name, player2Name);

        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);

    }
}

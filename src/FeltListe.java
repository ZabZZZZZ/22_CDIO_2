public class FeltListe {
    public static void checkNum(String playerName, int sum) {
        switch (sum) {
            case 2:
            System.out.println(playerName + " har reddet en prinsesse i et tårn, og hun gav " + playerName + " 250 som en gave.");
            break;

            case 3:
            System.out.println(playerName + " blev ramt af en meteor og mistede 100 i krateren der blev dannet under " + playerName + ".");
            break;

            case 4:
            System.out.println(playerName + " skulle til at erobre et palads, men blev betalt 100 ved porten for at lade paladset være.");
            break;

            case 5:
            System.out.println(playerName + " gik i gennem en kold ørken, og købte en frakke for 20 for at undgå den sikre død.");
            break;

            case 6:
            System.out.println(playerName + " fandt en befæstet by, og blev betalt 180 for at gå udenom.");
            break;

            case 7:
            System.out.println(playerName + " gik i gennem et kloster, og fik fred indenfra (men ingen penge)");
            break;

            case 8:
            System.out.println(playerName + " gik ind i en mørk hule og mistede 70.");
            break;

            case 9:
            System.out.println(playerName + " har fundet en øde hytte i bjergene, som havde 60 liggende indenfor.");
            break;

            case 10:
            System.out.println(playerName + " løb ind i en mur fyldt med varulve og mistede 70, men fik en ekstra tur.");
            break;

            case 11:
            System.out.println(playerName + " er faldtet ned i et stort hul, og mistede 50");
            break;
            
            case 12:
            System.out.println(playerName + " har fundet guld i bjergene go sælger det for 650, " + playerName + " er rig!");
            break;
        }
    }
}

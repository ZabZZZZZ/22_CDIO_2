public class FeltListe {
    private int fieldNumber;
    private String fieldDescription;
    private int Effect;

    public FeltListe(int n, String d, int e) {
        this.fieldNumber = n;
        this.fieldDescription = d;
        this.Effect = e;
    }

    //Getters
    public int getFieldNumber() {
        return this.fieldNumber;
    }

    public String getFieldDescription() {
        return this.fieldDescription;
    }

    public int getEffect() {
        return this.Effect;
    }

    //Methods
    public String toString() {
        return null;
    }

    public void useEffect(Player player, int sum) {
        var amount = getAmount(sum);
        if (amount < 0) {
            player.withdraw(amount);
        }
        else {
            player.deposit(amount);
        }
    }

    public void showFieldInfo() {
        System.out.println(/* Field info */);
    }

    public void landOnField(Player player) {

    }

    //A method to get the amount to be added or subtracted from the players account
    public static int getAmount(/*String playerName,*/ int sum) {
        switch (sum) {
            case 2:
            return 250;
            //System.out.println(playerName + " har reddet en prinsesse i et tårn, og hun gav " + playerName + " 250 som en gave.");
            // break;

            case 3:
            return -100;
            //System.out.println(playerName + " blev ramt af en meteor og mistede 100 i krateren der blev dannet under " + playerName + ".");
            // break;

            case 4:
            return 100;
            //System.out.println(playerName + " skulle til at erobre et palads, men blev betalt 100 ved porten for at lade paladset være.");
            // break;

            case 5:
            return -20;
            //System.out.println(playerName + " gik i gennem en kold ørken, og købte en frakke for 20 for at undgå den sikre død.");
            // break;

            case 6:
            return 180;
            //System.out.println(playerName + " fandt en befæstet by, og blev betalt 180 for at gå udenom.");
            // break;

            case 7:
            return 0;
            //System.out.println(playerName + " gik i gennem et kloster, og fik fred indenfra (men ingen penge)");
            // break;

            case 8:
            return -70;
            //System.out.println(playerName + " gik ind i en mørk hule og mistede 70.");
            // break;

            case 9:
            return 60;
            //System.out.println(playerName + " har fundet en øde hytte i bjergene, som havde 60 liggende indenfor.");
            // break;

            case 10:
            return -70;
            //System.out.println(playerName + " løb ind i en mur fyldt med varulve og mistede 70, men fik en ekstra tur.");
            // break;

            case 11:
            return -50;
            //System.out.println(playerName + " er faldtet ned i et stort hul, og mistede 50");
            // break;
            
            case 12:
            return 650;
            //System.out.println(playerName + " har fundet guld i bjergene go sælger det for 650, " + playerName + " er rig!");
            // break;

            default:
            return 0;
        }
    }
}

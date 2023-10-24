class SumChecker{
    public static void checkSum(int die1, int die2, Player player) {
        var sum = die1 + die2;

        var fields = new FeltListe[11];

        fields[0] = new FeltListe(2, "Prinsessen i tårnet gav dig 250 points!", 250);
        fields[1] = new FeltListe(3, "Du blev ramt af en meteor og du tabte 100 point i sandbunkerne fra krateret.", -100);
        fields[2] = new FeltListe(4, "Du er nået til Amalienborg og dronning Margrete kastede 100 points på dig.", 100);
        fields[3] = new FeltListe(5, "Du købte en frakke for at undslippe kulden for 20 points.", -20);
        fields[4] = new FeltListe(6, "Du når til Kings Landing og Jamie Lannister giver dig 180 points.", 180);
        fields[5] = new FeltListe(7, "Monkene i byen har intet til overs så du får eller mister ingenting.", 0);
        fields[6] = new FeltListe(8, "Juiced up Batman stjæler 70 points fra dig.", -70);
        fields[7] = new FeltListe(9, "Du finder 70 point i en efterladt hytte.", 70);
        fields[8] = new FeltListe(10, "Du bliver overfaldet af nogle varulve og mister 80 points, men du får en ekstra tur.", -80);
        fields[9] = new FeltListe(11, "Du snubler i en vandpytte og mister 50 points.", -50);
        fields[10] = new FeltListe(12, "Du har fundet guld i bjergene og sælger det for 650 points.", 650);

        for (int i = 0; i < fields.length; i++) {
            if (sum == fields[i].getFieldNumber()) {
                fields[i].landOnField(player);
                break;
            }
        }
    }
}
package histoire;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		personnages.Commercant marco = new personnages.Commercant("Marco", "thé", 150);
		personnages.Yakuza yaku = new personnages.Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		personnages.Ronin roro = new personnages.Ronin("Roro", "shochu", 60);
		
		
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.gagnerArgent(15);
		marco.boire();
		yaku.direBonjour();
		yaku.extorquer(marco);
		roro.direBonjour();
		roro.donner(marco);
		roro.provoquer(yaku);
		

	}

}

package personnages;

public class Yakuza extends Humain{
	String clan;
	int reputation;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.reputation = 0;
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant victime) {
		int argentExtorque = victime.getArgent();
		this.argent = argent + argentExtorque;
		this.reputation = reputation + 1;
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		parler("J’ai piqué les " + argentExtorque + " sous de " + victime.getNom() +
				", ce qui me fait " + argent + " sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
        int argent = getArgent();
        setArgent(0);
        this.reputation = reputation - 1;
        parler("J’ai perdu mon duel et mes " + argent + " sous, snif... J'ai "
        		+ "déshonoré le clan de " + clan + ".");
        return argent;
	}
	
	public void gagner(int gain) {
		this.argent = argent + gain;
		this.reputation = reputation + 1;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? "
				+ "Je l'ai dépouillé de ses " + gain + " sous.");
	}

}

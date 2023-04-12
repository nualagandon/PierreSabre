package personnages;

public class Yakuza extends Humain{
	String clan;
	int reputation;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.reputation = 0;
		this.clan = clan;
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

}

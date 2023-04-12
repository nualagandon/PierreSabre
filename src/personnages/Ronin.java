package personnages;

public class Ronin extends Humain{
	int honneur;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		this.honneur = 1;
	}
	
	public void donner(Commercant beneficiaire) {
		int don = argent / 10;
        this.argent = perdreArgent(don);
        beneficiaire.gagnerArgent(don);
        parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
        beneficiaire.parler(don + " sous ! Je te remercie généreux donateur!");
	}
	
	public void provoquer(Yakuza adversaire) {
		int reputation = adversaire.getReputation();
		
		if (honneur >= reputation) {
			int argentyak = adversaire.getArgent();
			this.argent = argent + argentyak;
			this.honneur = honneur + 1;
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			parler("Je t'ai eu petit yakuza!");
			adversaire.perdre();
		} else {
			this.honneur = honneur - 1;
			int perte = getArgent();
			this.argent = 0;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			adversaire.gagner(perte);
		}
	}
}

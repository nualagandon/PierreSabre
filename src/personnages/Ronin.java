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
}

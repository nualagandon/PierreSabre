package personnages;

public class Commercant extends Humain{
	
	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void recevoir(int argent) {
		setArgent(getArgent()+ argent);
		parler(argent + " sous ! Je te remercie généreux donateur!");
	}
	
	public int seFaireExtorquer() {
        int argent = getArgent();
        setArgent(0);
        parler("J'ai tout perdu! C'est vraiment trop injuste...");
        return argent;
	}
}

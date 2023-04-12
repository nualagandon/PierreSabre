package personnages;

public class Humain {
	private String nom;
	private String boisson;
	protected int argent;
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}
	public void direBonjour() {
		parler("Bonjour, Je m'appelle " + nom + " et j'aime boire du " + boisson + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	protected void parler(String texte) { 
		System.out.println(prendreParole() + texte); 
	} 
	 
	

	private String prendreParole() { 
		return "(" + nom + ") - "; 
	} 
	
	public void acheter(String bien, int prix) {
		if (prix > argent) {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un "
					+ bien + " à " + prix + " sous");
		} else {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un " + bien +
					" à " + prix + " sous");
			perdreArgent(prix);
		}
	}
	
	public int perdreArgent(int perte) {
		return argent = argent - perte;
	}
	
	public int gagnerArgent(int gain) {
		return argent = argent + gain;
	}
	
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "Kombucha", 54);
		
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
	}
	
}

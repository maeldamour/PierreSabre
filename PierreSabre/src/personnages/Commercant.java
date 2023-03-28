package personnages;

public class Commercant extends Humain {	
	
	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		boisson = "thé";
	}
	
	public int seFaireExtorquer() {
		int argent = super.getArgent();
		parler("J'ai tout perdu! Le monde est trop injuste...");
		perdreArgent(argent);
		return argent;
	}
	
	public int recevoir(int argent) {
		parler(argent + " sous ! Je te remercie généreux donateur!");
		gagnerArgent(argent);
		return argent;
	}

}

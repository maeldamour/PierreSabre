package personnages;

public class Yakuza extends Humain {
	int reputation = 0;
	
	public Yakuza(String nom, String boisson, int argent, String Clan) {
		super(nom, boisson, argent);
	}
	
	public void extorquer(Commercant victime) {
		int argentVictime = victime.getArgent();
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		parler("J'ai piqué les " + argentVictime + " sous de " + victime.getNom() + ", ce qui me fait " + gagnerArgent(argentVictime) + " sous dans ma poche. Hi ! Hi !");
		gagnerArgent(victime.getArgent());
		reputation += 1;
	}
}

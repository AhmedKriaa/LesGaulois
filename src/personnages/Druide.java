package personnages;

public class Druide {
	private String nom;
	private int effetPotionMax;
	private int effetPotionMin;
	public Druide(String nom, int effetPotionMax, int effetPotionMin) {
		this.nom = nom;
		this.effetPotionMax = effetPotionMax;
		this.effetPotionMin = effetPotionMin;
	parler("Bonjour, je suis le druide" + nom + " et ma potion peut aller d'une force " + effetPotionMin + "�" + effetPotionMax + ".");
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}
	
	private String prendreParole() {
		return "Le druide" + nom + ":";
	}
}
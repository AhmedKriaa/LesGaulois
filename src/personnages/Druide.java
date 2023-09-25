package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int forcePotion =1 ;
	private int effetPotionMax;
	private int effetPotionMin;
	public Druide(String nom, int effetPotionMax, int effetPotionMin) {
		this.nom = nom;
		this.effetPotionMax = effetPotionMax;
		this.effetPotionMin = effetPotionMin;
	parler("Bonjour, je suis le druide" + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à " + effetPotionMax + ".");
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
	public void preparerPotion() {
		Random random  = new Random();
		forcePotion = random.nextInt(effetPotionMax);
		if (forcePotion>7) {
			parler("J'ai préparé une super potion de force"+ forcePotion );
			
		}else {
			parler(" Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force »" + forcePotion );
		}
	}
	public static void main(String[] args) {
		Druide paronamix = new Druide ("Paronamix", 10 , 5 );
		
	}
}


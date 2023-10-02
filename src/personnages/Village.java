package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int [] Villageois ; 
	private int nbVillageois = 0 ;
	
	public Village(String nom) {
		this.nom = nom;
		
	}
	int nbVillageoisMaximum = nbVillageois ;
	
	public Village(int nbVillageoisMaximum) {
		super();
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		Villageois [] villageois = new Villageois [nbVillageoisMaximum] ;
	}
	public void ajouterHabitant(Gaulois gaulois) {
		
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
}

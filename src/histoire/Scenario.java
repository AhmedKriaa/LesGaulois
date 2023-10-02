package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois ("asterix" , 8);
		Gaulois obelix = new Gaulois ("Obelix" , 10);
		Romain Minus = new Romain("Minus", 6);
		Druide paronamix = new Druide ("Paronamix", 5 , 10 );

		paronamix.parler(" <<je  vais aller preparer une petite potion ...>>");
		paronamix.preparerPotion();
		paronamix.booster(obelix);
		paronamix.booster(asterix);
		asterix.parler("<<Bonjour>>");
		Minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(Minus);
		
	}

}
;
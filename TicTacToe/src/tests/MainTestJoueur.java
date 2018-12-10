package tests;

import java.util.ArrayList;

public class MainTestJoueur {
	public static void main(String[] args) {
		String informations;
		
		ArrayList<Joueur> listeJ = new ArrayList<Joueur>();
		
		Joueur j1 = new Joueur("RoBoTiX", "000001", 12);
		Joueur j2 = new Joueur("Soufl", "000002", 75);
		Joueur j3 = new Joueur("GlaglaskO", "000003", 125);
		
		listeJ.add(j1);
		listeJ.add(j2);
		listeJ.add(j3);
		
		for(Joueur j : listeJ) {
			informations = j.toString();
			System.out.println(informations);
		}
	}
}

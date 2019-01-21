package ttt;

public class Partie {
	public Partie() {
	}
	
	public void lancer() {
		Plateau plateau = new Plateau();
		
		plateau.affichePlateau();
		
		while(!estPartieTerminee()) {
			
		}
	}
	
	public boolean estPartieTerminee() {
		boolean res = false;
		
		return res;
	}
}
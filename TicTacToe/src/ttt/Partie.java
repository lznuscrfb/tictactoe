package ttt;

public class Partie {
	public Partie() {
	}
	
	public void lancer() {
		Plateau plateau = new Plateau();
		
		while(!estPartieTerminee()) {
			plateau.affichePlateau();
		}
	}
	
	public boolean estPartieTerminee() {
		boolean res = true;
		
		return res;
	}
}
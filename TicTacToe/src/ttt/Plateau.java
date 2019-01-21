package ttt;

public class Plateau {
	private int[][] _plateau;
	
	public Plateau() {
		_plateau = new int[3][3];
	}
	
	public void affichePlateau() {
		// U+0305
		System.out.println("  1   2   3\n___________");
		for(int i=0; i<3; i++) {
			if((i>0) && (i<3)) {
				System.out.println("|-----------|");
			}
			for(int j=0; j<3; j++) {
				System.out.print(" " + _plateau[i][j] + " |");
			}
			System.out.println();
		}
	}
}

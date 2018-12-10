package ttt;

public class Plateau {
	int[][] _plateau;
	
	public Plateau() {
		_plateau = new int[3][3];
	}
	
	public void affichePlateau() {
		for(int i=0; i<3; i++) {
			if((i>0) && (i<3)) {
				System.out.println("-----------");
			}
			for(int j=0; j<3; j++) {
				if(j<2) {
					System.out.print(" " + _plateau[i][j] + " |");
				}
				else {
					System.out.print(" " + _plateau[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}

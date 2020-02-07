
public class Matrice {

	public int[] listePosition = {6,6,6,6,6,6,6};
	public int[][] matrice = new int[7][7];

	public int balise = 0;
	
	public int joueur = 1;
	

	public void nouveauJeton(int x, int y) /*lance tous les controles*/{
		this.balise = 0;
		if(matrice[x][y]==matrice[x][y-1]) {
			this.balise++;
			verifVertical(x,y-1);
		}else if(matrice[x][y]==matrice[x-1][y]) {
			this.balise++;
			verifHorizontalGauche(x-1,y);
		}else if(matrice[x][y]==matrice[x+1][y]) {
			this.balise++;
			verifHorizontalDroite(x+1,y);
		}else if(matrice[x][y]==matrice[x-1][y-1]) {
			this.balise++;
			verifDiagonalDroiteHaute(x-1,y-1);
		}else if(matrice[x][y]==matrice[x+1][y+1]) {
			this.balise++;
			verifDiagonalDroiteBasse(x+1,y+1);
		}else if(matrice[x][y]==matrice[x+1][y-1]) {
			this.balise++;
			verifDiagonalGaucheHaute(x+1,y-1);
		}else if(matrice[x][y]==matrice[x-1][y-1]){
			this.balise++;
			verifDiagonalGaucheBasse(x-1,y+1);
		}
	}

	
	//Tous les controles dans toutes les directions possibles, en recursif
	public void verifVertical(int x, int y) {
		if(matrice[x][y]==matrice[x][y-1]) {
			if(this.balise!=4) {
				this.balise++;
				verifVertical(x,y-1);
			}
		}
	}

	public void verifHorizontalGauche(int x, int y) {
		if(matrice[x][y]==matrice[x-1][y]) {
			if(this.balise!=4) {
				this.balise++;
				verifVertical(x-1,y);
			}
		}
	}
	
	public void verifHorizontalDroite(int x, int y) {
		if(matrice[x][y]==matrice[x+1][y]) {
			if(this.balise!=4) {
				this.balise++;
				verifVertical(x-1,y);
			}
		}
	}
	
	public void verifDiagonalDroiteHaute(int x, int y) {
		if(matrice[x][y]==matrice[x-1][y-1]) {
			if(this.balise!=4) {
				this.balise++;
				verifVertical(x-1,y-1);
			}
		}
	}
	
	public void verifDiagonalDroiteBasse(int x, int y) {
		if(matrice[x][y]==matrice[x+1][y+1]) {
			if(this.balise!=4) {
				this.balise++;
				verifVertical(x+1,y+1);
			}
		}
	}
	
	public void verifDiagonalGaucheBasse(int x, int y) {
		if(matrice[x][y]==matrice[x-1][y+1]) {
			if(this.balise!=4) {
				this.balise++;
				verifVertical(x-1,y+1);
			}
		}
	}
	
	public void verifDiagonalGaucheHaute(int x, int y) {
		if(matrice[x][y]==matrice[x+1][y-1]) {
			if(this.balise!=4) {
				this.balise++;
				verifVertical(x+1,y-1);
			}
		}
	}
	

	public Matrice() {

	}

}

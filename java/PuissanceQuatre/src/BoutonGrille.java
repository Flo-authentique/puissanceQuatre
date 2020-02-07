import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.Arrays;

public class BoutonGrille extends JButton {
	
	private int position;
	
	public BoutonGrille(int position, Matrice matrix) {
		this.setText(new Integer(position).toString()); // a supprimer
		this.position = position+1;
		this.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent evenement) {
				matrix.matrice[matrix.listePosition[position]][position] = matrix.joueur;
				matrix.listePosition[position]--;
				switch(matrix.joueur) {
				case 1 :
					matrix.joueur = 2;
					break;
				default :
					matrix.joueur = 1;
				}
				
				//matrix.nouveauJeton(matrix.listePosition[position], position);
				
				
				for(int[] i : matrix.matrice) {
					System.out.println(Arrays.toString(i));
				}
				System.out.println();
			}
		});
	}
}

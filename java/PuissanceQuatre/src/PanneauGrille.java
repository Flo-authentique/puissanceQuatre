import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class PanneauGrille extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public PanneauGrille(Matrice matrix) {
		this.setLayout(new GridLayout(7, 7));
		
		BoutonGrille[] boutons = new BoutonGrille[7];
		for(int i = 0; i < 7; i++) {
			boutons[i] = new BoutonGrille(i, matrix);
			this.add(boutons[i]);
		}
		
		JPanel[][] matricePanneau = new JPanel[6][7];
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 7; j++) {
				matricePanneau[i][j] = new JPanel() {
					private static final long serialVersionUID = 1L;

					protected void paintComponent(Graphics dessin) {
						super.paintComponent(dessin);
						
						
						dessin.fillOval(3, 3, 90, 90);
					}
				};
				this.add(matricePanneau[i][j]);
			}
		}

	}
}

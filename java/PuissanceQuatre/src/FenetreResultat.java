import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class FenetreResultat extends Fenetre {
	
	private static final long serialVersionUID = 1L;
	
	public FenetreResultat() {
		
		super("Nous avons un gagnant !!!",510,100);
		
		
		
		this.setContentPane(new JPanel() {

			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics dessin) {
				Font font = new Font("Times New Roman",Font.PLAIN,35);
				dessin.setFont(font);
				dessin.drawString("Bien joué joueur "+1+" tu l'as éclaté !! :)", 10, 30);
			}
		});
	}
	
}

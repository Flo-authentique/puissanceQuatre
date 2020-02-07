import javax.swing.JFrame;

public class Fenetre extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public Fenetre(String titre, int x, int y) {
		this.setSize(x, y);
		this.setTitle(titre);
		
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}


public class Grille extends Fenetre{

	private static final long serialVersionUID = 1L;
	
	public Matrice matrix = new Matrice();
	
	
	
	private PanneauGrille jpanel = new PanneauGrille(matrix);
	
	public Grille() {
		super("Puissance 4", 700, 700);
		
		this.setContentPane(jpanel);
		
		
	}
}

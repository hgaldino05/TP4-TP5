package tp3_dados;


/**
 * Classe referente aos dados dos Pastéis presentes no cardápio
 * @author Henrique Galdino
 *
 */
public class Pastel {
	private String sabor;

	private int estoque;
	
	public Pastel(String dadosCad, int i) {
		// TODO Auto-generated constructor stub
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
}

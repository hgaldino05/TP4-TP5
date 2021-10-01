package tp3_dados;

//Classe referente aos dados das bebidas presentes no cardápio
public class Bebida {
	
	private String sabor;
	
	private int estoque;
	
	public Bebida(String dadosCad, int i) {
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

package tp3_dados;

//Classe referente aos dados das bebidas presentes no card�pio
public class Bebida {
	
	private String sabor;
	
	private int estoque;
	
	public Bebida() {
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

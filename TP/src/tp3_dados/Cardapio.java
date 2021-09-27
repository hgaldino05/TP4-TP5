package tp3_dados;

//Classe referente ao cardápio
public class Cardapio {
	
	private String produtos;
	private String descricaoProdutos;
	private double precoProdutos;


public Cardapio() {
	
	
}


public String getProdutos() {
	return produtos;
}

public void setProdutos(String produtos) {
	this.produtos = produtos;
}

public String getDescricaoProdutos() {
	return descricaoProdutos;
}

	public void setDescricaoProdutos(String descricaoProdutos) {
		this.descricaoProdutos = descricaoProdutos;
	}

	public double getPrecoProdutos() {
		return precoProdutos;
	}

	public void setPrecoProdutos(double precoProdutos) {
		this.precoProdutos = precoProdutos;
	}


}

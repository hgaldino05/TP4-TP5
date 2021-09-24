package tp3_dados;


//Classe referente ao relatório de venda
public class RelatorioVenda {
	private Venda venda;
	private String dataVenda;
	
	public RelatorioVenda() {
	}
	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public String getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	
}

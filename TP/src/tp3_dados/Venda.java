package tp3_dados;


//Classe referente as vendas que serão cadastradas no sistema
public class Venda {

	private Double valor;
	private int qtdProduto;	
	private String produtoPedido;
	private String formaDePagamento;
	private String cliente;
	private String vendedor;
	private String dataVenda;
	
	public Venda() {
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getProdutoPedido() {
		return produtoPedido;
	}
	public void setProdutoPedido(String produtoPedido) {
		this.produtoPedido = produtoPedido;
	}
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	public int getQtdProduto() {
		return qtdProduto;
	}
	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}	
	
	public String getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}
}

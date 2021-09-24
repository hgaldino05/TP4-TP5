package tp3_dados;


//Classe referente as vendas que serão cadastradas no sistema
public class Venda {

	private Double valor;
	private int qtdProduto;
	private int qtdBebida;	
	private String produtoPedido;
	private String bebidaPedida;
	private String formaDePagamento;
	private String cliente;
	private String vendedor;
	
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
	
	public String getBebidaPedida() {
		return bebidaPedida;
	}
	public void setBebidaPedida(String bebidaPedida) {
		this.bebidaPedida = bebidaPedida;
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
	public int getQtdBebida() {
		return qtdBebida;
	}
	public void setQtdBebida(int qtdBebida) {
		this.qtdBebida = qtdBebida;
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
	
}

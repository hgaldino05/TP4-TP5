package tp3_registros;

import tp3_dados.*;
public class RegistrosDados {
	private Dados d = new Dados();
	
	
	public RegistrosDados(){
		d.PreCadastrar();
	}

	public Dados getDados() {
		return d;
	}
	
	public void setDados(Dados d) {
		d = this.d;
	}
	
	public Bebida[] listarBebida() {
		return this.d.getBebidaControle();
	}
	
	public int qtdBebidas() {
		return this.d.getTotalBebidas();
	}
	
	public Pastel[] listarPastel() {
		return this.d.getPastelControle();
	}
	
	public int qtdPasteis() {
		return this.d.getTotalPasteis();
	}
	
	public Cliente[] listarCliente() {
		return this.d.getClienteControle();
	}
	
	public int qtdClientes() {
		return this.d.getTotalClientes();
	}
	
	public Colaborador[] listarColaborador() {
		return this.d.getColaboradorControle();
	}
	
	public int qtdColaboradores() {
		return this.d.getTotalColaboradores();
	}
	
	public Cardapio[] listarCardapio() {
		return this.d.getCardapioControle();
	}
	
	public int itensCardapio() {
		return this.d.getTotalCardapio();
	}
	
	public Venda[] listarVenda() {
		return this.d.getVendaControle();
	}
	
	public int qtdVendas() {
		return this.d.getTotalVendas();
	}
}

package tp3_dados;
import java.util.ArrayList;
import java.util.List;

public class Dados extends Programa{
	private List<Bebida> bebida;
	private List<Pastel> pastel;
	private List<Cardapio> cardapio;
	private List<Cliente> cliente;
	private List<Colaborador> colaborador;
	private List<Venda> venda;
	private List<RelatorioVenda> relatorioVenda;
	
	private Bebida[] bebidaControle = new Bebida[99];
	private int totalBebidas = 0;
	private Pastel[] pastelControle = new Pastel[99];
	private int totalPasteis = 0;
	private Cliente[] clienteControle = new Cliente[99];
	private int totalClientes = 0;
	private Colaborador[] colaboradorControle = new Colaborador[99];
	private int totalColaboradores = 0;
	private Cardapio[] cardapioControle = new Cardapio[99];
	private int totalCardapio = 0;
	private Venda[] vendaControle = new Venda[99];
	private int totalVendas = 0;
	private RelatorioVenda[] relatorioControle = new RelatorioVenda[99];
	private int totalRelatorios = 0;
	
	public void PreCadastrar() {
		bebida = new ArrayList<Bebida>();
		pastel = new ArrayList<Pastel>();
		cardapio = new ArrayList<Cardapio>();
		cliente = new ArrayList<Cliente>();
		colaborador = new ArrayList<Colaborador>();
		relatorioVenda = new ArrayList<RelatorioVenda>();
		venda = new ArrayList<Venda>();
		
		preCadastros();
		cardapioCadastrado();
		vendaCadastrada();
		relatorioCadastrado();
		
		for(int i = 0; i < 10; i++) {
			clienteControle[i] = cliente.get(i);
			colaboradorControle[i] = colaborador.get(i);
			pastelControle[i] = pastel.get(i);
			bebidaControle[i] = bebida.get(i);
			cardapioControle[i]= cardapio.get(i);
		}
		
		totalClientes = cliente.size();
		totalBebidas = bebida.size();
		totalPasteis = pastel.size();
		
		for (int j = 0; j < 5; j++) {
			vendaControle[j] = venda.get(j);
			relatorioControle[j] = relatorioVenda.get(j);
		}
		
		totalVendas = venda.size();
		totalRelatorios = relatorioVenda.size();
	}

	public Bebida[] getBebidaControle() {
		return bebidaControle;
	}

	public void setBebidaControle(Bebida[] bebidaControle) {
		this.bebidaControle = bebidaControle;
	}

	public int getTotalBebidas() {
		return totalBebidas;
	}

	public void setTotalBebidas(int totalBebidas) {
		this.totalBebidas = totalBebidas;
	}

	public Pastel[] getPastelControle() {
		return pastelControle;
	}

	public void setPastelControle(Pastel[] pastelControle) {
		this.pastelControle = pastelControle;
	}

	public int getTotalPasteis() {
		return totalPasteis;
	}

	public void setTotalPasteis(int totalPasteis) {
		this.totalPasteis = totalPasteis;
	}

	public Cliente[] getClienteControle() {
		return clienteControle;
	}

	public void setClienteControle(Cliente[] clienteControle) {
		this.clienteControle = clienteControle;
	}

	public int getTotalClientes() {
		return totalClientes;
	}

	public void setTotalClientes(int totalClientes) {
		this.totalClientes = totalClientes;
	}

	public Colaborador[] getColaboradorControle() {
		return colaboradorControle;
	}

	public void setColaboradorControle(Colaborador[] colaboradorControle) {
		this.colaboradorControle = colaboradorControle;
	}

	public int getTotalColaboradores() {
		return totalColaboradores;
	}

	public void setTotalColaboradores(int totalColaboradores) {
		this.totalColaboradores = totalColaboradores;
	}

	public Cardapio[] getCardapioControle() {
		return cardapioControle;
	}

	public void setCardapioControle(Cardapio[] cardapioControle) {
		this.cardapioControle = cardapioControle;
	}

	public int getTotalCardapio() {
		return totalCardapio;
	}

	public void setTotalCardapio(int totalCardapio) {
		this.totalCardapio = totalCardapio;
	}

	public Venda[] getVendaControle() {
		return vendaControle;
	}

	public void setVendaControle(Venda[] vendaControle) {
		this.vendaControle = vendaControle;
	}

	public int getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(int totalVendas) {
		this.totalVendas = totalVendas;
	}

	public RelatorioVenda[] getRelatorioControle() {
		return relatorioControle;
	}

	public void setRelatorioControle(RelatorioVenda[] relatorioControle) {
		this.relatorioControle = relatorioControle;
	}

	public int getTotalRelatorios() {
		return totalRelatorios;
	}

	public void setTotalRelatorios(int totalRelatorios) {
		this.totalRelatorios = totalRelatorios;
	}
	
	
}


package tp3_registros;
import tp3_dados.*;
@SuppressWarnings("unused")
public class ManipulaDados {
	
	private Bebida[] b;
	private int qtdBebidas;
	
	private Pastel[] p;
	private int qtdPasteis;
	
	private Cliente[] cl;
	private int qtdClientes;
	
	private Colaborador[] co;
	private int qtdColaboradores;
	
	private Cardapio[] ca;
	private int qtdItensCardapio;
	
	private Venda[] v;
	private int qtdVendas;
	
	public ManipulaDados(RegistrosDados registro) {
		b = registro.listarBebida();
		qtdBebidas = registro.qtdBebidas();
		
		p = registro.listarPastel();
		qtdPasteis = registro.qtdPasteis();
		
		cl = registro.listarCliente();
		qtdClientes = registro.qtdClientes();
		
		co = registro.listarColaborador();
		qtdColaboradores = registro.qtdColaboradores();
		
		ca = registro.listarCardapio();
		qtdItensCardapio = registro.itensCardapio();
		
		v = registro.listarVenda();
		qtdVendas = registro.qtdVendas();
		
	}
	
	public String[] getListaBebida() {
		String[] listaBebidas = new String[qtdBebidas];
		for(int i = 0; i < qtdBebidas; i++) {
			listaBebidas[i] = b[i].getSabor() + "  ESTOQUE: " + b[i].getEstoque();
		}
		
		return listaBebidas;
	}
	public String[] getListaPastel() {
		String[] listaPasteis = new String[qtdPasteis];
		for(int i = 0; i < qtdPasteis; i++) {
			listaPasteis[i] = p[i].getSabor()+ "  ESTOQUE: " + p[i].getEstoque();
		}
		
		return listaPasteis;
	}
	public String[] getListaCliente() {
		String[] listaClientes = new String[qtdClientes];
		for(int i = 0; i < qtdClientes; i++) {
			listaClientes[i] = cl[i].getNome() + "   PONTOS: " + cl[i].getPontuacao();
		}
		
		return listaClientes;
	}
	public String[] getListaColaborador() {
		String[] listaColaboradores = new String[qtdColaboradores];
		for(int i = 0; i < qtdColaboradores; i++) {
			listaColaboradores[i] = co[i].getNome() + "   ID: " + co[i].getID();
		}
		
		return listaColaboradores;
	}
	public String[] getItensCardapio() {
		String[] produtosCardapio = new String[qtdItensCardapio];
		for(int i = 0; i < qtdItensCardapio; i++) {
			produtosCardapio[i] = ca[i].getProdutos();

		}
		
		return produtosCardapio;
	}
	public String[] getListaVendas() {
		String[] listaVendas = new String[qtdVendas];
		for(int i = 0; i < qtdVendas; i++) {
			listaVendas[i] = v[i].getDataVenda() + " CLIENTE: " + v[i].getCliente()+ "  VALOR: R$" + v[i].getValor();
			
		}
		
		return listaVendas;
	}
}

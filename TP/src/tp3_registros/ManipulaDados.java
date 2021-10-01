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
	private Dados d;
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
			
			if(b[i].getSabor() == null) {
				listaBebidas[i] = "NOVA BEBIDA: CLIQUE PARA INSERIR OS DADOS";
			}
		}
		
		return listaBebidas;
	}
	public String[] getListaPastel() {
		String[] listaPasteis = new String[qtdPasteis];
		for(int i = 0; i < qtdPasteis; i++) {
			listaPasteis[i] = p[i].getSabor()+ "  ESTOQUE: " + p[i].getEstoque();
			
			if(p[i].getSabor() == null) {
				listaPasteis[i] = "NOVO PASTEL: CLIQUE PARA INSERIR OS DADOS";
			}
			
		}
		
		return listaPasteis;
	}
	public String[] getListaCliente() {
		String[] listaClientes = new String[qtdClientes];
		for(int i = 0; i < qtdClientes; i++) {
			listaClientes[i] = cl[i].getNome() + "   PONTOS: " + cl[i].getPontuacao();
			if(cl[i].getNome() == null) {
				listaClientes[i] = "NOVO CLIENTE: CLIQUE PARA INSERIR OS DADOS";
			}
		}
		
		return listaClientes;
	}
	public String[] getListaColaborador() {
		String[] listaColaboradores = new String[qtdColaboradores];
		for(int i = 0; i < qtdColaboradores; i++) {
			listaColaboradores[i] = co[i].getNome() + "   ID: " + co[i].getID();
			if(co[i].getNome() == null) {
				listaColaboradores[i] = "NOVO COLABORADOR: CLIQUE PARA INSERIR OS DADOS";
			}
		}
		
		return listaColaboradores;
	}
	public String[] getItensCardapio() {
		String[] produtosCardapio = new String[qtdItensCardapio];
		for(int i = 0; i < qtdItensCardapio; i++) {
			produtosCardapio[i] = ca[i].getProdutos();
			if(ca[i].getProdutos() == null) {
				produtosCardapio[i] = "NOVO PRODUTO: CLIQUE PARA INSERIR OS DADOS";
			}
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

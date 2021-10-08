package tp3_registros;
import tp3_dados.*;
@SuppressWarnings("unused")


/**Classe que pega os dados presentes em RegistrosDados e exibe no JList de cada objeto
 *
 * @author Henrique Galdino
 */
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
	
	
	/**
	 * Associa a lista de dados cadastrados aos vetores que serão printados nas JLists
	 * @param registro
	 */
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
	
	
	/**
	 * lista as bebidas cadastradas no List Bebidas
	 * @return a bebida de cada indice e a quantidade em estoque no formato de String
	 */
	public String[] getListaBebida() {//metodo que lista bebidas
		String[] listaBebidas = new String[qtdBebidas];
		for(int i = 0; i < qtdBebidas; i++) {
			listaBebidas[i] = b[i].getSabor() + "  ESTOQUE: " + b[i].getEstoque();
			
			if(b[i].getSabor() == null) {
				listaBebidas[i] = "NOVA BEBIDA: CLIQUE PARA INSERIR OS DADOS";
			}
		}
		
		return listaBebidas;
	}
	
	/**
	 * lista os pasteis cadastrados no List Pasteis
	 * @return o pastel de cada indice e a quantidade em estoque no formato de String
	 */
	public String[] getListaPastel() {//metodo que lista pasteis
		String[] listaPasteis = new String[qtdPasteis];
		for(int i = 0; i < qtdPasteis; i++) {
			listaPasteis[i] = p[i].getSabor()+ "  ESTOQUE: " + p[i].getEstoque();
			
			if(p[i].getSabor() == null) {
				listaPasteis[i] = "NOVO PASTEL: CLIQUE PARA INSERIR OS DADOS";
			}
			
		}
		
		return listaPasteis;
	}
	
	/**
	 * lista os clientes cadastrados no List Clientes
	 * @return o cliente de cada indice e a quantidade de pontos no formato de String
	 */
	public String[] getListaCliente() {//metodo que lista clientes
		String[] listaClientes = new String[qtdClientes];
		for(int i = 0; i < qtdClientes; i++) {
			listaClientes[i] = cl[i].getNome() + "   PONTOS: " + cl[i].getPontuacao();
			if(cl[i].getNome() == null) {
				listaClientes[i] = "NOVO CLIENTE: CLIQUE PARA INSERIR OS DADOS";
			}
		}
		
		return listaClientes;
	}
	
	/**
	 * lista os colaboradores cadastrados no List Colaboradores
	 * @return o colaborador de cada indice e o seu ID
	 */
	public String[] getListaColaborador() {//metodo que lista os colaboradores
		String[] listaColaboradores = new String[qtdColaboradores];
		for(int i = 0; i < qtdColaboradores; i++) {
			listaColaboradores[i] = co[i].getNome() + "   ID: " + co[i].getID();
			if(co[i].getNome() == null) {
				listaColaboradores[i] = "NOVO COLABORADOR: CLIQUE PARA INSERIR OS DADOS";
			}
		}
		
		return listaColaboradores;
	}
	
	/**
	 * lista os produtos cadastrados no List Cardapio
	 * @return o produto de cada indice
	 */
	public String[] getItensCardapio() {//metodo que lista os produtos do Cardapio
		String[] produtosCardapio = new String[qtdItensCardapio];
		for(int i = 0; i < qtdItensCardapio; i++) {
			produtosCardapio[i] = ca[i].getProdutos();
			if(ca[i].getProdutos() == null) {
				produtosCardapio[i] = "NOVO PRODUTO: CLIQUE PARA INSERIR OS DADOS";
			}
		}
		
		return produtosCardapio;
	}
	
	/**
	 * lista as vendas cadastradas no List Clientes
	 * @return a venda de cada indice, o cliente que efetuou a compra e o valor da mesma
	 */
	public String[] getListaVendas() {//metodo que lista as vendas
		String[] listaVendas = new String[qtdVendas];
		for(int i = 0; i < qtdVendas; i++) {
			listaVendas[i] = v[i].getDataVenda() + " CLIENTE: " + v[i].getCliente()+ "  VALOR: R$" + v[i].getValor();
			
		}
		
		return listaVendas;
	}
}

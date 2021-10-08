package tp3_registros;

import tp3_dados.Bebida;
import tp3_dados.Cardapio;
import tp3_dados.Cliente;
import tp3_dados.Colaborador;
import tp3_dados.Dados;
import tp3_dados.Pastel;
import tp3_dados.Venda;

/**Classe que contém os métodos que cadastram um novo indice nas listas e que recebe os dados pré-cadastrados no sistema
 * 
 * @author Henrique Galdino
 *
 */
public class RegistrosDados {
	private Dados d = new Dados();
	
	/**Adiciona os dados pré-cadastrados toda vez que o programa é executado
	 * 
	 */
	public RegistrosDados(){//metodo que adiciona os dados pre cadastrados no sistema toda vez que for iniciado
		d.PreCadastrar();

	}

	/**
	 * retorna a classe dados para que possa pegar os outros valores dela
	 * @return classe Dados
	 */
	public Dados getDados() {
		return d;
	}
	/**
	 * Atribui a classe Dados
	 * @param d
	 */
	public void setDados(Dados d) {
		d = this.d;
	}
	
	/**
	 * recebe as bebidas da List presente na classe Dados
	 * @return o metodo que retorna a List de Bebidas
	 */
	public Bebida[] listarBebida() {
		return this.d.getBebidaControle();
	}
	/**
	 * recebe as quantidade de bebidas na List presente na classe Dados
	 * @return o metodo que retorna a quantidade de indices da List de Bebidas
	 */
	public int qtdBebidas() {
		return this.d.getTotalBebidas();
	}

	/**
	 * recebe os pasteis da List presente na classe Dados
	 * @return o metodo que retorna a List de Pasteis
	 */
	public Pastel[] listarPastel() {
		return this.d.getPastelControle();
	}
	
	/**
	 * recebe as quantidade de pasteis na List presente na classe Dados
	 * @return o metodo que retorna a quantidade de indices da List de Pasteis
	 */
	public int qtdPasteis() {
		return this.d.getTotalPasteis();
	}
	
	/**
	 * recebe os clientes da List presente na classe Dados
	 * @return o metodo que retorna a List de Clientes
	 */
	public Cliente[] listarCliente() {
		return this.d.getClienteControle();
	}
	
	/**
	 * recebe as quantidade de clientes na List presente na classe Dados
	 * @return o metodo que retorna a quantidade de indices da List de Clientes
	 */
	public int qtdClientes() {
		return this.d.getTotalClientes();
	}
	
	/**
	 * recebe os colaboradores da List presente na classe Dados
	 * @return o metodo que retorna a List de Colaboradores
	 */
	public Colaborador[] listarColaborador() {
		return this.d.getColaboradorControle();
	}
	
	/**
	 * recebe as quantidade de colaboradores na List presente na classe Dados
	 * @return o metodo que retorna a quantidade de indices da List de Colaboradores
	 */
	public int qtdColaboradores() {
		return this.d.getTotalColaboradores();
	}
	
	/**
	 * recebe os produtoss da List presente na classe Dados
	 * @return o metodo que retorna a List de Cardapio
	 */
	public Cardapio[] listarCardapio() {
		return this.d.getCardapioControle();
	}
	
	/**
	 * recebe as quantidade de produtos na List presente na classe Dados
	 * @return o metodo que retorna a quantidade de indices da List de Cardapio
	 */
	public int itensCardapio() {
		return this.d.getTotalCardapio();
	}
	
	/**
	 * recebe os produtoss da List presente na classe Dados
	 * @return o metodo que retorna a List de Vendas
	 */
	public Venda[] listarVenda() {
		return this.d.getVendaControle();
	}
	
	/**
	 * recebe as quantidade de vendas na List presente na classe Dados
	 * @return o metodo que retorna a quantidade de indices da List de Vendas
	 */
	public int qtdVendas() {
		return this.d.getTotalVendas();
	}
	
	/**recebe um vetor String e adiciona ele como bebida
	 * 
	 * @param dadosCad
	 * @return true ou false, adicionando uma nova bebida na lista dependendo do resultado
	 */
	public boolean cadBebida(String[] dadosCad) {//cadastra bebidas no sistema
		if(!dadosCad[1].matches("[0-9]+") || !dadosCad[2].matches("[0-9]+")) {
		
			
			return false;
		}else {
			Bebida b = new Bebida(dadosCad[1],Integer.parseInt(dadosCad[2]));
			
			
			d.bebidaCadastrar(b, Integer.parseInt(dadosCad[0]));
			return true;
		}
	}
	
	/**recebe um vetor String e adiciona ele como pastel
	 * 
	 * @param dadosCad
	 * @return true ou false, adicionando um novo pastel na lista dependendo do resultado
	 */
	public boolean cadPastel(String[] dadosCad) {//cadastra pasteis no sistema
		if(!dadosCad[1].matches("[0-9]+") || !dadosCad[2].matches("[0-9]+")) {
		
			
			return false;
		}else {
			Pastel p = new Pastel(dadosCad[1],Integer.parseInt(dadosCad[2]));
			
			
			d.pastelCadastrar(p, Integer.parseInt(dadosCad[0]));
			
			return true;
		}
	}
	
	/**recebe um vetor String e adiciona ele como cliente
	 * 
	 * @param dadosCad
	 * @return true ou false, adicionando um novo cliente na lista dependendo do resultado
	 */
	public boolean cadCliente(String[] dadosCad) {//cadastra clientes no sistema
		if(!dadosCad[1].matches("[0-9]+") || !dadosCad[2].matches("[0-9]+")
				|| !dadosCad[3].matches("[0-9]+") || !dadosCad[4].matches("[0-9]+")) {
			
			
			return false;
		}else {
			Cliente c = new Cliente(dadosCad[1],dadosCad[2],dadosCad[3],Integer.parseInt(dadosCad[4]));
			
			
			d.clienteCadastrar(c, Integer.parseInt(dadosCad[0]));
			
			return false;
		}
	}
	
	/**recebe um vetor String e adiciona ele como colaborador
	 * 
	 * @param dadosCad
	 * @return true ou false, adicionando um novo colaborador na lista dependendo do resultado
	 */
	public boolean cadColaborador(String[] dadosCad) {//cadastra colaboradores no sistema
		if(!dadosCad[1].matches("[0-9]+") || !dadosCad[2].matches("[0-9]+")
				|| !dadosCad[3].matches("[0-9]+") || !dadosCad[4].matches("[0-9]+")) {
			
			
			return false;
		}else {
			Colaborador c = new Colaborador(dadosCad[1],dadosCad[2],dadosCad[3],dadosCad[4]);
			
			
			d.colaboradorCadastrar(c, Integer.parseInt(dadosCad[0]));
			
			return true;
		}
	}
	
	
	/**recebe um vetor String e adiciona ele como Cardapio
	 * 
	 * @param dadosCad
	 * @return true ou false, adicionando um novo produto na lista dependendo do resultado
	 */
	public boolean cadCardapio(String[] dadosCad) {//cadastra produtos no sistema
		if(!dadosCad[1].matches("[0-9]+") || !dadosCad[2].matches("[0-9]+")
				|| !dadosCad[3].matches("[0-9]+")) {
			
			Cardapio c = new Cardapio(dadosCad[1],dadosCad[2],dadosCad[3]);
			
			
			d.cardapioCadastrar(c, Integer.parseInt(dadosCad[0]));
			
			return false;
		}else {
			
			
			
			return true;
		}
	}
}

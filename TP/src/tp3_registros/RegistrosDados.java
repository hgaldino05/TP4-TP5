package tp3_registros;

import tp3_dados.Bebida;
import tp3_dados.Cardapio;
import tp3_dados.Cliente;
import tp3_dados.Colaborador;
import tp3_dados.Dados;
import tp3_dados.Pastel;
import tp3_dados.Venda;

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
	
	public boolean cadBebida(String[] dadosCad) {
		if(!dadosCad[1].matches("[0-9]+") || !dadosCad[2].matches("[0-9]+")) {
			Bebida b = new Bebida(dadosCad[1],Integer.parseInt(dadosCad[2]));
			
			
			d.bebidaCadastrar(b, Integer.parseInt(dadosCad[0]));
			
			return false;
		}else {
			Bebida b = new Bebida(dadosCad[1],Integer.parseInt(dadosCad[2]));
			
			
			d.bebidaCadastrar(b, Integer.parseInt(dadosCad[0]));
			return true;
		}
	}
	
	public boolean cadPastel(String[] dadosCad) {
		if(!dadosCad[1].matches("[0-9]+") || !dadosCad[2].matches("[0-9]+")) {
			Pastel p = new Pastel(dadosCad[1],Integer.parseInt(dadosCad[2]));
			
			
			d.pastelCadastrar(p, Integer.parseInt(dadosCad[0]));
			
			return false;
		}else {
			Pastel p = new Pastel(dadosCad[1],Integer.parseInt(dadosCad[2]));
			
			
			d.pastelCadastrar(p, Integer.parseInt(dadosCad[0]));
			
			return true;
		}
	}
	public boolean cadCliente(String[] dadosCad) {
		if(!dadosCad[1].matches("[0-9]+") || !dadosCad[2].matches("[0-9]+")
				|| !dadosCad[3].matches("[0-9]+") || !dadosCad[4].matches("[0-9]+")) {
			Cliente c= new Cliente(dadosCad[1],dadosCad[2],dadosCad[3],Integer.parseInt(dadosCad[4]));
			
			
			d.clienteCadastrar(c, Integer.parseInt(dadosCad[0]));
			
			return false;
		}else {
			Cliente c = new Cliente(dadosCad[1],dadosCad[2],dadosCad[3],Integer.parseInt(dadosCad[4]));
			
			
			d.clienteCadastrar(c, Integer.parseInt(dadosCad[0]));
			
			return false;
		}
	}
	public boolean cadColaborador(String[] dadosCad) {
		if(!dadosCad[1].matches("[0-9]+") || !dadosCad[2].matches("[0-9]+")
				|| !dadosCad[3].matches("[0-9]+") || !dadosCad[4].matches("[0-9]+")) {
			Colaborador c = new Colaborador(dadosCad[1],dadosCad[2],dadosCad[3],dadosCad[4]);
			
			
			d.colaboradorCadastrar(c, Integer.parseInt(dadosCad[0]));
			
			return false;
		}else {
			Colaborador c = new Colaborador(dadosCad[1],dadosCad[2],dadosCad[3],dadosCad[4]);
			
			
			d.colaboradorCadastrar(c, Integer.parseInt(dadosCad[0]));
			
			return true;
		}
	}
	public boolean cadCardapio(String[] dadosCad) {
		if(!dadosCad[1].matches("[0-9]+") || !dadosCad[2].matches("[0-9]+")
				|| !dadosCad[3].matches("[0-9]+")) {
			Cardapio c = new Cardapio(dadosCad[1],dadosCad[2],dadosCad[3]);
			
			
			d.cardapioCadastrar(c, Integer.parseInt(dadosCad[0]));
			
			return false;
		}else {
			Cardapio c = new Cardapio(dadosCad[1],dadosCad[2],dadosCad[3]);
			
			
			d.cardapioCadastrar(c, Integer.parseInt(dadosCad[0]));
			
			
			return true;
		}
	}
}

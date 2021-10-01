package tp3_dados;

//Classe referente aos dados do colaborador
public class Colaborador extends Pessoa{
	
	private String ID;
	private String dataEntrada;
	
	public Colaborador(String dadosCad, String dadosCad2, String dadosCad3, String dadosCad4) {
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cpf) {
		CPF = cpf;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	
	
}

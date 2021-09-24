package tp3_dados;

//Classe referente aos dados do colaborador
public class Colaborador extends Pessoa{
	
	private String ID;
	private String dataEntrada;
	
	public Colaborador() {
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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

package tp3_tela;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import tp3_registros.*;

public class TelaClienteColaborador implements ActionListener{
	private JFrame janela;
	
	//Dados comuns as duas classes
	private JLabel nome = new JLabel("Nome: ");
	private JTextField textNome;
	private JLabel CPF = new JLabel("CPF: ");
	private JTextField textCPF;
	
	//Dados Cliente
	private JLabel pontuacao = new JLabel("Pontua��o: ");
	private JTextField textPontuacao;
	private JLabel telefone = new JLabel("Telefone: ");
	private JTextField textTelefone;
	
	//Dados Colaborador
	private JLabel ID =  new JLabel("ID: ");
	private JTextField textID;
	private JLabel dataEntrada = new JLabel("Funcion�rio desde: ");
	private JTextField textData;
	
	private JButton salvar =  new JButton("SALVAR");
	private JButton deletar =  new JButton("DELETAR");
	
	private static RegistrosDados registro;
	private int indice;
	private int opcao;
	private String nomeTela;
	
	public void editarClienteColaborador(int op, RegistrosDados r, TelaCadastros t, int ind) {
		
		opcao = op;
		registro = r;
		indice = ind;
		
		if(op == 1) nomeTela = "Cadastrar Cliente";
		if(op == 2) nomeTela = "Editar Cliente";
		if(op == 3) nomeTela = "Cadastrar Colaborador";
		if(op == 4) nomeTela = "Editar Colaborador";
		
		janela = new JFrame(nomeTela);
		
		if(op == 2) {
			String pontos;
			pontos = Integer.toString(registro.listarCliente()[indice].getPontuacao());
			
			textNome = new JTextField(registro.listarCliente()[indice].getNome(), 200);
			textCPF = new JTextField(registro.listarCliente()[indice].getCPF());
			textTelefone = new JTextField(registro.listarCliente()[indice].getTelefone());
			textPontuacao = new JTextField(pontos, 200);
			
		}else if(op == 4) {
			
			textNome = new JTextField(registro.listarColaborador()[indice].getNome(), 200);
			textCPF = new JTextField(registro.listarColaborador()[indice].getCPF(), 200);
			textID = new JTextField(registro.listarColaborador()[indice].getID(), 200);
			textData = new JTextField(registro.listarColaborador()[indice].getDataEntrada(), 200);
			
			
		}else {
			
			//Dados comuns em ambas as classes
			textNome = new JTextField(200);
			textCPF = new JTextField(200);
			
			//Dados presentes s� em Cliente
			textPontuacao = new JTextField(200);
			textTelefone = new JTextField(200);
			//Dados presentes s� em Colaborador
			
			textID = new JTextField(200);
			textData = new JTextField(200);
			
			salvar.setBounds(245, 190, 120, 20);
		}
		
		nome.setBounds(30, 20, 150, 25);
		textNome.setBounds(180, 20, 180, 25);
		
		CPF.setBounds(30, 40, 150, 25);
		textCPF.setBounds(180, 40, 180, 25);
		
		//Adiciona o TextField dos dados do Cliente
		if (op == 1 || op == 2 ) {
			
			pontuacao.setBounds(30, 60, 150, 25);
			textPontuacao.setBounds(180, 60, 180, 25);
			
			telefone.setBounds(30, 80, 150, 25);
			textTelefone.setBounds(180, 80, 180, 25);
			
			this.janela.add(pontuacao);
			this.janela.add(textPontuacao);
			
			this.janela.add(telefone);
			this.janela.add(textTelefone);

		} 
		
		//Adiciona o TextField dos dados do Colaborador
		if (op == 3 || op == 4 ) {
			ID.setBounds(30, 60, 150, 25);
			textID.setBounds(180, 60, 180, 25);
			
			dataEntrada.setBounds(30, 80, 150, 25);
			textData.setBounds(180, 80, 180, 25);
			
			this.janela.add(ID);
			this.janela.add(textID);
			
			this.janela.add(dataEntrada);
			this.janela.add(textData);

		}
		
		if (op == 2 || op == 4) {
			salvar.setBounds(120, 175, 115, 30);
			deletar.setBounds(245, 175, 115, 30);
			this.janela.add(deletar);
		}
		this.janela.add(nome);
		this.janela.add(textNome);
		
		this.janela.add(CPF);
		this.janela.add(textCPF);
		this.janela.add(salvar);
		
		this.janela.setLayout(null);
		
		this.janela.setSize(500, 350);
		this.janela.setVisible(true);
		
		salvar.addActionListener(this);
		deletar.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == salvar) {
			
			
		}
	}
}

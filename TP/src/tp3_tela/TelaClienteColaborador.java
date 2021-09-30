package tp3_tela;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


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
	private JLabel pontuacao = new JLabel("Pontuação: ");
	private JTextField textPontuacao;
	private JLabel telefone = new JLabel("Telefone: ");
	private JTextField textTelefone;
	
	//Dados Colaborador
	private JLabel ID =  new JLabel("ID: ");
	private JTextField textID;
	private JLabel dataEntrada = new JLabel("Funcionário desde: ");
	private JTextField textData;
	
	private JButton salvar =  new JButton("SALVAR");
	private JButton deletar =  new JButton("DELETAR");
	
	private static RegistrosDados registro;
	private int indice;
	private int opcao;
	private String nomeTela;	
	private String[] dado = new String[20];

	
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
			
			//Dados presentes só em Cliente
			textPontuacao = new JTextField(200);
			textTelefone = new JTextField(200);
			//Dados presentes só em Colaborador
			
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
			
			if(opcao == 1) { //cadastrar cliente
				dado[0] = Integer.toString(registro.qtdClientes());
			}else if(opcao == 3) {
				dado[0] = Integer.toString(registro.qtdColaboradores());
			}else if(opcao == 2){ //editar cliente
				dado[0] = Integer.toString(indice);
				
				dado[1] = textNome.getText();
				dado[2] = textCPF.getText();
				dado[3] = textTelefone.getText();
				dado[4] = textPontuacao.getText();
				
				int novaPontuacao = Integer.parseInt(dado[4]);
				
				registro.listarCliente()[indice].setNome(dado[1]);
				registro.listarCliente()[indice].setCPF(dado[2]);
				registro.listarCliente()[indice].setTelefone(dado[3]);
				registro.listarCliente()[indice].setPontuacao(novaPontuacao);
				
				mensagemClienteSucesso();
			}else if(opcao == 4){ //editar colaborador
				dado[0] = Integer.toString(indice);
				
				dado[1] = textNome.getText();
				dado[2] = textCPF.getText();
				dado[3] = textID.getText();
				dado[4] = textData.getText();
				
				registro.listarColaborador()[indice].setNome(dado[1]);
				registro.listarColaborador()[indice].setCPF(dado[2]);
				registro.listarColaborador()[indice].setID(dado[3]);
				registro.listarColaborador()[indice].setDataEntrada(dado[4]);
				
				mensagemColaboradorSucesso();
			}		
		}
	}
	public void mensagemClienteSucesso() {
		JOptionPane.showMessageDialog(null, "CLIENTE EDITADO COM SUCESSO", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	public void mensagemColaboradorSucesso() {
		JOptionPane.showMessageDialog(null, "COLABORADOR EDITADO COM SUCESSO", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
}

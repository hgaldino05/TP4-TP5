package tp3_tela;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



import tp3_registros.*;


//classe referente a parte grafica de bebida e pastel
public class TelaBebidaPastel implements ActionListener {
	
	//atributos que formam a janela
	private JFrame janela;
	private JLabel sabor = new JLabel("Sabor: ");
	private JTextField textSabor;
	private JLabel estoque = new JLabel("Estoque: ");
	private JTextField textEstoque;
	
	private JButton salvar;
	private JButton deletar =  new JButton("DELETAR");
	
	
	private static RegistrosDados registro;
	private int indice;
	private int opcao;
	private String nomeTela;
	private String[] dado = new String[20];
	public void editarBebidaPastel(int op, RegistrosDados r, TelaCadastros t, int ind) {
		
		opcao = op;
		registro = r;
		indice = ind;
		
		if(op == 1) nomeTela = "Cadastrar Bebida";
		if(op == 2) nomeTela = "Editar Bebida";
		if(op == 3) nomeTela = "Cadastrar Pastel";
		if(op == 4) nomeTela = "Editar Pastel";
		
		janela = new JFrame(nomeTela);
		
		//caso seja "editar"
		if(op == 2) {
			String estoqueB;
			estoqueB = Integer.toString(registro.listarBebida()[indice].getEstoque());
			
			textSabor = new JTextField(registro.listarBebida()[indice].getSabor(), 200);
			textEstoque = new JTextField(estoqueB, 200);
			salvar = new JButton("SALVAR");
		}else if(op == 4) {
			String estoqueP;
			estoqueP = Integer.toString(registro.listarPastel()[indice].getEstoque());
			
			textSabor = new JTextField(registro.listarPastel()[indice].getSabor(), 200);
			textEstoque = new JTextField(estoqueP, 200);
			salvar = new JButton("SALVAR");
		}else { //caso seja "cadastrar"
			textSabor = new JTextField("1",200);
			textEstoque = new JTextField("1",200);
			
			salvar = new JButton("CADASTRAR");
			salvar.setForeground(Color.RED);
		}
		
		sabor.setBounds(30, 20, 150, 25);
		textSabor.setBounds(180, 20, 180, 25);
		estoque.setBounds(30, 60, 150, 25);
		textEstoque.setBounds(180, 60, 180, 25);
		
		if (op == 1 || op == 3 ) { //caso seja "cadastrar"
			
			salvar.setBounds(120,50,140,100);
			mensagemBotao();
		}
		
		if (op == 2 || op == 4 ) { //caso seja "editar"
			janela.add(sabor);
			janela.add(estoque);
			this.janela.add(textSabor);
			this.janela.add(textEstoque);
			

			salvar.setBounds(120, 175, 115, 30);
			salvar.setForeground(Color.BLUE);
			deletar.setBounds(245, 175, 115, 30);
			deletar.setForeground(Color.RED);
			this.janela.add(deletar);
			
		}
	
		
		janela.add(salvar);
		
		this.janela.setLayout(null);
		
		this.janela.setSize(400, 250);
		this.janela.setVisible(true);
		
		salvar.addActionListener(this);
		deletar.addActionListener(this);
	}
		public void actionPerformed(ActionEvent e) {
			Object src = e.getSource();
			
			if(src == salvar) {//caso o botao "salvar" seja ativado
				@SuppressWarnings("unused")
				boolean res;
				
				if(opcao == 1) { //cadastrar bebida
					dado[0] = Integer.toString(registro.qtdBebidas());
					
					dado[1] = textSabor.getText();
					dado[2] = textEstoque.getText();
					
					res = registro.cadBebida(dado);
					
					mensagemBebidaCadastrada();
					//registro.listarPastel()[registro.qtdBebidas()].setSabor(registro.cadBebida(dado).B);;
					
					
				}else if(opcao == 3) { //cadastrar pastel 
					dado[0] = Integer.toString(registro.qtdPasteis());
					
					dado[1] = textSabor.getText();
					dado[2] = textEstoque.getText();
					
					res = registro.cadPastel(dado);
					
					mensagemPastelCadastrado();
				}else { //editar bebida/pastel
					dado[0] = Integer.toString(indice);
					
					dado[1] = textSabor.getText();
					dado[2] = textEstoque.getText();
					
					if(opcao == 2) {
						int novoEstoque = Integer.parseInt(dado[2]);
						registro.listarBebida()[indice].setSabor(dado[1]);
						registro.listarBebida()[indice].setEstoque(novoEstoque);
						
						mensagemBebidaSucesso();
					}else if(opcao == 4) {
						int novoEstoque = Integer.parseInt(dado[2]);
						registro.listarPastel()[indice].setSabor(dado[1]);
						registro.listarPastel()[indice].setEstoque(novoEstoque);
						
						mensagemPastelSucesso();
					}
				}
				
			}
			
			if(src == deletar) {//caso o botao "deletar" seja ativado
				
				if(opcao == 2) { //excluir bebida
					
					if(indice == (registro.qtdBebidas() - 1)) { //caso a bebida selecionada esteja no ultimo indice do vetor
						
						registro.listarBebida()[indice] = null;
						registro.getDados().setTotalBebidas(registro.getDados().getTotalBebidas() - 1);
						
						mensagemBebidaDeletada();
					}else {
						String saborDeletar = registro.listarBebida()[indice].getSabor();
						
						int contador = 0;
						while(registro.listarBebida()[contador].getSabor().compareTo(saborDeletar) != 0) {
							contador++;
						}
							
							for(int i = contador; i < registro.qtdBebidas(); i++) {
								registro.listarBebida()[i] = null;
								registro.listarBebida()[i] = registro.listarBebida()[i + 1];
							}
							registro.listarBebida()[registro.qtdBebidas()] = null;
							registro.getDados().setTotalBebidas(registro.getDados().getTotalBebidas() - 1);
						mensagemBebidaDeletada();
					
					}
				}else if(opcao == 4) { //excluir pastel
					
					if(indice == (registro.qtdPasteis() - 1)) { //caso o pastel selecionado esteja no ultimo indice do vetor
						
						
						registro.listarPastel()[indice] = null;
						registro.getDados().setTotalPasteis(registro.getDados().getTotalPasteis() - 1);
						
						mensagemPastelDeletado();
					}else {
						String saborDeletar = registro.listarPastel()[indice].getSabor();
						
						int contador = 0;
						while(registro.listarPastel()[contador].getSabor().compareTo(saborDeletar) != 0) {
							contador++;
						}
							
							for(int i = contador; i < registro.qtdPasteis(); i++) {
								registro.listarPastel()[i] = null;
								registro.listarPastel()[i] = registro.listarPastel()[i + 1];
							}
							registro.listarPastel()[registro.qtdPasteis()] = null;
							registro.getDados().setTotalPasteis(registro.getDados().getTotalPasteis() - 1);
						mensagemPastelDeletado();
					
					}
				
				}
			
			}
		}
		
		//mensagem quando a bebida for editada com sucesso
		public void mensagemBebidaSucesso() {
			JOptionPane.showMessageDialog(null, "BEBIDA EDITADA COM SUCESSO", null, 
					JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}
		
		
		//mensagem quando o pastel for editado com sucesso
		public void mensagemPastelSucesso() {
			JOptionPane.showMessageDialog(null, "PASTEL EDITADO COM SUCESSO", null, 
					JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}
		
		//mensagem quando a bebida for deletada com sucesso
		public void mensagemBebidaDeletada() {
			JOptionPane.showMessageDialog(null, "BEBIDA DELETADA COM SUCESSO", null, 
					JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}
		
		//mensagem quando o pastel for deletado com sucesso
		public void mensagemPastelDeletado() {
			JOptionPane.showMessageDialog(null, "PASTEL DELETADO COM SUCESSO", null, 
					JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}
		
		//mensagem quando a bebida for cadastrada com sucesso
		public void mensagemBebidaCadastrada() {
			JOptionPane.showMessageDialog(null, "BEBIDA ADICONADA A LISTA\n"
					+ "FAVOR ATUALIZAR A LISTA E INSERIR OS DADOS", null, 
					JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}
		
		//mensagem quando o pastel for cadastrado com sucesso
		public void mensagemPastelCadastrado() {
			JOptionPane.showMessageDialog(null, "PASTEL ADICONADA A LISTA\n"
					+ "FAVOR ATUALIZAR A LISTA E INSERIR OS DADOS", null, 
					JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}
		
		//mensagem quando o botao "cadastrar" for ativado
		public void mensagemBotao() {
			JOptionPane.showMessageDialog(null, "CLIQUE NO BOTAO PARA ADICIONAR\n"
					+ "NA LISTA", null, 
					JOptionPane.INFORMATION_MESSAGE);
		}
}

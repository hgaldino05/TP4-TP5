<<<<<<< HEAD
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


/**Exibe a tela ao clicar em um dos indices da lista de bebidas/pasteis
 * @author Henrique Galdino
 * @verso 1.0
 * 
 * */
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
	private boolean cadastra;
	
	/**
	* Checa o indice selecionado no menu e exibe a tela referente ao mesmo * 
	* @param op um int que informa qual ação o usuário optou por realizar (Cadastro/Edição)
	* @param r classe RegistrosDados cujos dados serão usados
	* @param t classe TelaCadastro que identifia qual parte do menu foi acessada
	* @param ind int que serve como "contador", passando pelos índices das listas
	* 
	* @return Tela referente a ação que o usuário escolheu
 */
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
	
	/**
	 * Verifica e define o que acontece quando cada um dos botões é ativado
	 * 
	 * @param e, que verifica qual dos botões foi acionado
	 * @return a mensagem referente a ação que se originou através da ativação do botão
	 */
		public void actionPerformed(ActionEvent e) {
			Object src = e.getSource();
			
			if(src == salvar) {//caso o botao "salvar" seja ativado
				
				if(opcao == 1) { //cadastrar bebida
					dado[0] = Integer.toString(registro.qtdBebidas());
					
					dado[1] = textSabor.getText();
					dado[2] = textEstoque.getText();
					
					cadastra = registro.cadBebida(dado);
					
					mensagemBebidaCadastrada();
					//registro.listarPastel()[registro.qtdBebidas()].setSabor(registro.cadBebida(dado).B);;
					
					
				}else if(opcao == 3) { //cadastrar pastel 
					dado[0] = Integer.toString(registro.qtdPasteis());
					
					dado[1] = textSabor.getText();
					dado[2] = textEstoque.getText();
					
					cadastra = registro.cadPastel(dado);
					
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
		
		/**
		 * Mensagem que é exibida quando os dados da bebida são editados
		 * @return janela com texto "BEBIDA EDITADA COM SUCESSO"
		 */
		public void mensagemBebidaSucesso() {//mensagem quando a bebida for editada com sucesso
			JOptionPane.showMessageDialog(null, "BEBIDA EDITADA COM SUCESSO", null, 
					JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}
		
		
		/**
		 * Mensagem que é exibida quando os dados do pastel são editados
		 * @return janela com texto "PASTEL EDITADO COM SUCESSO"
		 */
		public void mensagemPastelSucesso() {//mensagem quando o pastel for editado com sucesso
			JOptionPane.showMessageDialog(null, "PASTEL EDITADO COM SUCESSO", null, 
					JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}
		
		/**
		 * Mensagem que é exibida quando os dados da bebida são deletados
		 * @return janela com texto "BEBIDA DELETADA COM SUCESSO"
		 */	
		public void mensagemBebidaDeletada() {//mensagem quando a bebida for deletada com sucesso
			JOptionPane.showMessageDialog(null, "BEBIDA DELETADA COM SUCESSO", null, 
					JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}
		
		/**
		 * Mensagem que é exibida quando os dados do pastel são deletados
		 * @return janela com texto "PASTEL EDITADO COM SUCESSO"
		 */
		public void mensagemPastelDeletado() {//mensagem quando o pastel for deletado com sucesso
			JOptionPane.showMessageDialog(null, "PASTEL DELETADO COM SUCESSO", null, 
					JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}
		
		/**
		 * Mensagem que é exibida quando a bebida é cadastrada e adicionada a lista
		 * @return janela com texto "BEBIDA ADICIONADA A LISTA FAVOR ATUALIZAR A LISTA E  INSERIR OS DADOS"
		 */
		public void mensagemBebidaCadastrada() {//mensagem quando a bebida for cadastrada com sucesso
			JOptionPane.showMessageDialog(null, "BEBIDA ADICONADA A LISTA\n"
					+ "FAVOR ATUALIZAR A LISTA E INSERIR OS DADOS", null, 
					JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}
		
		/**
		 * Mensagem que é exibida quando o pastel é cadastrado e adicionado a lista
		 * @return janela com texto "PASTEL ADICIONADA A LISTA FAVOR ATUALIZAR A LISTA E  INSERIR OS DADOS"
		 */
		public void mensagemPastelCadastrado() {//mensagem quando o pastel for cadastrado com sucesso
			JOptionPane.showMessageDialog(null, "PASTEL ADICONADA A LISTA\n"
					+ "FAVOR ATUALIZAR A LISTA E INSERIR OS DADOS", null, 
					JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}
		
		/**
		 * Mensagem que é exibida quando o botão "cadastrar" é ativado na janela que contém a lista
		 * @return janela com texto "CLIQUE NO BOTAO PARA ADICIONAR"
		 */
		public void mensagemBotao() {//mensagem quando o botao "cadastrar" for ativado
			JOptionPane.showMessageDialog(null, "CLIQUE NO BOTAO PARA ADICIONAR\n"
					+ "NA LISTA", null, 
					JOptionPane.INFORMATION_MESSAGE);
		}
	
		public boolean testeBebidaPastel() {
			registro = new RegistrosDados();
			boolean testeBebida = cadastra;
			
			for(int i = 0; i < 10; i++) {
			
				if(registro.listarBebida()[i].getSabor() != registro.listarPastel()[i].getSabor()) {
					testeBebida = true;
				}
			
			}
			
			return testeBebida;
		}
}
=======
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


/**Exibe a tela ao clicar em um dos indices da lista de bebidas/pasteis
 * @author Henrique Galdino
 * @verso 1.0
 * 
 * */
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
	
	/**
	* Checa o indice selecionado no menu e exibe a tela referente ao mesmo * 
	* @param op um int que informa qual ação o usuário optou por realizar (Cadastro/Edição)
	* @param r classe RegistrosDados cujos dados serão usados
	* @param t classe TelaCadastro que identifia qual parte do menu foi acessada
	* @param ind int que serve como "contador", passando pelos índices das listas
	* 
	* @return Tela referente a ação que o usuário escolheu
 */
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
	
	/**
	 * Verifica e define o que acontece quando cada um dos botões é ativado
	 * 
	 * @param e, que verifica qual dos botões foi acionado
	 * @return a mensagem referente a ação que se originou através da ativação do botão
	 */
		public void actionPerformed(ActionEvent e) {
			Object src = e.getSource();
			
			if(src == salvar) {//caso o botao "salvar" seja ativado
				@SuppressWarnings("unused")
				boolean cadastra;
				
				if(opcao == 1) { //cadastrar bebida
					dado[0] = Integer.toString(registro.qtdBebidas());
					
					dado[1] = textSabor.getText();
					dado[2] = textEstoque.getText();
					
					cadastra = registro.cadBebida(dado);
					
					mensagemBebidaCadastrada();
					//registro.listarPastel()[registro.qtdBebidas()].setSabor(registro.cadBebida(dado).B);;
					
					
				}else if(opcao == 3) { //cadastrar pastel 
					dado[0] = Integer.toString(registro.qtdPasteis());
					
					dado[1] = textSabor.getText();
					dado[2] = textEstoque.getText();
					
					cadastra = registro.cadPastel(dado);
					
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
		
		/**
		 * Mensagem que é exibida quando os dados da bebida são editados
		 * @return janela com texto "BEBIDA EDITADA COM SUCESSO"
		 */
		public void mensagemBebidaSucesso() {//mensagem quando a bebida for editada com sucesso
			JOptionPane.showMessageDialog(null, "BEBIDA EDITADA COM SUCESSO", null, 
					JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}
		
		
		/**
		 * Mensagem que é exibida quando os dados do pastel são editados
		 * @return janela com texto "PASTEL EDITADO COM SUCESSO"
		 */
		public void mensagemPastelSucesso() {//mensagem quando o pastel for editado com sucesso
			JOptionPane.showMessageDialog(null, "PASTEL EDITADO COM SUCESSO", null, 
					JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}
		
		/**
		 * Mensagem que é exibida quando os dados da bebida são deletados
		 * @return janela com texto "BEBIDA DELETADA COM SUCESSO"
		 */	
		public void mensagemBebidaDeletada() {//mensagem quando a bebida for deletada com sucesso
			JOptionPane.showMessageDialog(null, "BEBIDA DELETADA COM SUCESSO", null, 
					JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}
		
		/**
		 * Mensagem que é exibida quando os dados do pastel são deletados
		 * @return janela com texto "PASTEL EDITADO COM SUCESSO"
		 */
		public void mensagemPastelDeletado() {//mensagem quando o pastel for deletado com sucesso
			JOptionPane.showMessageDialog(null, "PASTEL DELETADO COM SUCESSO", null, 
					JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}
		
		/**
		 * Mensagem que é exibida quando a bebida é cadastrada e adicionada a lista
		 * @return janela com texto "BEBIDA ADICIONADA A LISTA FAVOR ATUALIZAR A LISTA E  INSERIR OS DADOS"
		 */
		public void mensagemBebidaCadastrada() {//mensagem quando a bebida for cadastrada com sucesso
			JOptionPane.showMessageDialog(null, "BEBIDA ADICONADA A LISTA\n"
					+ "FAVOR ATUALIZAR A LISTA E INSERIR OS DADOS", null, 
					JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}
		
		/**
		 * Mensagem que é exibida quando o pastel é cadastrado e adicionado a lista
		 * @return janela com texto "PASTEL ADICIONADA A LISTA FAVOR ATUALIZAR A LISTA E  INSERIR OS DADOS"
		 */
		public void mensagemPastelCadastrado() {//mensagem quando o pastel for cadastrado com sucesso
			JOptionPane.showMessageDialog(null, "PASTEL ADICONADA A LISTA\n"
					+ "FAVOR ATUALIZAR A LISTA E INSERIR OS DADOS", null, 
					JOptionPane.INFORMATION_MESSAGE);
			janela.dispose();
		}
		
		/**
		 * Mensagem que é exibida quando o botão "cadastrar" é ativado na janela que contém a lista
		 * @return janela com texto "CLIQUE NO BOTAO PARA ADICIONAR"
		 */
		public void mensagemBotao() {//mensagem quando o botao "cadastrar" for ativado
			JOptionPane.showMessageDialog(null, "CLIQUE NO BOTAO PARA ADICIONAR\n"
					+ "NA LISTA", null, 
					JOptionPane.INFORMATION_MESSAGE);
		}
}
>>>>>>> 55ed07721f6cebbfc70f10922c03996006eb03af

<<<<<<< HEAD
package tp3_tela;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;


import tp3_registros.*;

/**Exibe a tela ao clicar em um dos Produtos da Lista
 * @author Henrique Galdino
 * @verso 1.0
 * 
 * */
public class TelaCardapio implements ActionListener{
	private JFrame janela;
	
	private JLabel produto = new JLabel("Produto: ");
	private JTextField textProduto;
	private JLabel descricao = new JLabel("Descrição: ");
	private JTextField textDescricao;
	private JLabel preco = new JLabel("Preço: ");
	private JTextField textPreco;
	
	private JButton salvar;
	private JButton deletar =  new JButton("DELETAR");
	
	//Parte referente a busca de produto
	private JButton buscar = new JButton("BUSCAR");
	private JTextField produtoBusca = new JTextField(200);
	private JLabel titulo = new JLabel("INSIRA O NOME E CLIQUE NO BOTÃO");
	
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
	public void editarCardapio(int op, RegistrosDados r, TelaCadastros t, int ind) {
		
		opcao = op;
		registro = r;
		indice = ind;
		
		if(op == 1) nomeTela = "Cadastrar Produto";
		if(op == 2) nomeTela = "Dados do Produto";
		
		janela = new JFrame(nomeTela);
		
		if(op ==2) {//se for "editar"
			String precoProd;
			precoProd = String.valueOf(registro.listarCardapio()[indice].getPrecoProdutos());
			
			textProduto = new JTextField(registro.listarCardapio()[indice].getProdutos());
			textDescricao = new JTextField(registro.listarCardapio()[indice].getDescricaoProdutos());
			textPreco = new JTextField(precoProd);
			salvar = new JButton("SALVAR");
			
		}else {//se for "cadastrar"
			textProduto = new JTextField(200);
			textDescricao = new JTextField(200);
			textPreco = new JTextField(200);
			salvar =  new JButton("CADASTRAR");
			salvar.setForeground(Color.RED);
		}
		
		if (op == 1) {//se for "cadastrar"
			mensagemBotao();
			salvar.setBounds(140,50,140,140);
		}
		
		if (op == 2) {//se for "editar"
			produto.setBounds(30, 20, 150, 25);
			textProduto.setBounds(180, 20, 180, 25);
		
			descricao.setBounds(30, 40, 150, 25);
			textDescricao.setBounds(180, 40, 180, 25);
		
			preco.setBounds(30, 60, 150, 25);
			textPreco.setBounds(180, 60, 180, 25);
			
			salvar.setBounds(120, 175, 115, 30);
			salvar.setForeground(Color.BLUE);
			deletar.setBounds(245, 175, 115, 30);
			deletar.setForeground(Color.RED);
			this.janela.add(produto);
			this.janela.add(textProduto);
			this.janela.add(descricao);
			this.janela.add(textDescricao);
			this.janela.add(preco);
			this.janela.add(textPreco);
			this.janela.add(deletar);
		}
		
		
		this.janela.add(salvar);
		
		this.janela.setLayout(null);
		
		this.janela.setSize(500, 350);
		this.janela.setVisible(true);
		
		salvar.addActionListener(this);
		deletar.addActionListener(this);
	}
	
	/**
	 * Define a tela de busca para a lista de Clientes
	 * 
	 * @return Tela referente a ação que o usuário escolheu
	 */
	public void buscaProduto() {
		janela = new JFrame("Busca produto");
		
		produtoBusca.setBounds(140, 60, 180, 25);
		buscar.setBounds(180, 100, 110, 30);
		titulo.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		titulo.setBounds(60, 10,350, 30);
		
		this.janela.setLayout(null);
		
		this.janela.setSize(500, 200);
		this.janela.setVisible(true);
		this.janela.add(produtoBusca);
		this.janela.add(buscar);
		this.janela.add(titulo);
		
		buscar.addActionListener(this);
	}
	
	/**
	 * Verifica e define o que acontece quando cada um dos botões é ativado
	 * 
	 * @param e, que verifica qual dos botões foi acionado
	 * @return a mensagem referente a ação que se originou através da ativação do botão
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == salvar) {
			
			
			
			
			if(opcao == 1) { //cadastrar itens no cardapio
				dado[0] = Integer.toString(registro.itensCardapio());
				
				dado[1] = textProduto.getText();
				dado[2] = textDescricao.getText();
				dado[3] = textPreco.getText();
				
				cadastra = registro.cadCardapio(dado);
				
				mensagemCardapioCadastrado();
			}else { //editar itens no cardapio
				dado[0] = Integer.toString(indice);
				
				dado[1] = textProduto.getText();
				dado[2] = textDescricao.getText();
				dado[3] = textPreco.getText();
				
				dado[3].replaceAll(",", ".");
				double novoPreco = Double.parseDouble(dado[3]);
				registro.listarCardapio()[indice].setProdutos(dado[1]);
				registro.listarCardapio()[indice].setDescricaoProdutos(dado[2]);
				registro.listarCardapio()[indice].setPrecoProdutos(novoPreco);
				mensagemCardapioSucesso();
			}
			
				
		}
		
		if(src == deletar) {
			
			if(opcao == 2) { //excluir item do cardapio
				
				if(indice == (registro.itensCardapio() - 1)) { //Se for a última bebida da lista
					
					registro.listarCardapio()[indice] = null;
					registro.getDados().setTotalCardapio(registro.getDados().getTotalCardapio() - 1);
					
	
				}else {
					String produtoDeletar = registro.listarCardapio()[indice].getProdutos();
					
					int contador = 0;
					while(registro.listarCardapio()[contador].getProdutos().compareTo(produtoDeletar) != 0) {
						contador++;
					}
						
						for(int i = contador; i < registro.itensCardapio(); i++) {
							registro.listarCardapio()[i] = null;
							registro.listarCardapio()[i] = registro.listarCardapio()[i + 1];
						}
						registro.listarCardapio()[registro.itensCardapio()] = null;
						registro.getDados().setTotalCardapio(registro.getDados().getTotalCardapio() - 1);
				
				}
				
				mensagemCardapioDeletado();
			}
		}
		
		if(src == buscar) {
			RegistrosDados buscarRegistro = new RegistrosDados();
	
			for(int i = 0; i< buscarRegistro.qtdClientes(); i++) {
				
				if(produtoBusca.getText().equalsIgnoreCase(buscarRegistro.listarCardapio()[i].getProdutos())) {
					editarCardapio(2, buscarRegistro, null, i);
					janela.remove(salvar);
					janela.remove(deletar);
				}
			}
		}
	}
	

	/**
	 * Mensagem que é exibida quando os dados do produto são editados
	 * @return janela com texto "ITEM EDITADO COM SUCESSO"
	 */
	public void mensagemCardapioSucesso() {//quando edita com sucesso
		JOptionPane.showMessageDialog(null, "ITEM EDITADO COM SUCESSO", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	
	/**
	 * Mensagem que é exibida quando os dados do produto são deletados
	 * @return janela com texto "ITEM DELETADO COM SUCESSO"
	 */
	public void mensagemCardapioDeletado() {//quando deleta com sucesso
		JOptionPane.showMessageDialog(null, "ITEM DELETADO COM SUCESSO", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	
	/**
	 * Mensagem que é exibida quando o produto é cadastrado e adiconado a lista
	 * @return janela com texto "PRODUTO ADICIONADO A LISTA FAVOR ATUALIZAR A LISTA E INSERIR OS DADOS"
	 */
	public void mensagemCardapioCadastrado() {//quando cadastra com sucesso
		JOptionPane.showMessageDialog(null, "PRODUTO ADICONADO A LISTA\n"
				+ "FAVOR ATUALIZAR A LISTA E INSERIR OS DADOS", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	
	/**
	 * Mensagem que é exibida quando o botão "cadastrar" é ativado na janela que contém a lista
	 * @return janela com texto "CLIQUE NO BOTAO PARA ADICIONAR"
	 */
	public void mensagemBotao() {//mensagem quando botao "cadastrar" for ativado
		JOptionPane.showMessageDialog(null, "CLIQUE NO BOTAO PARA ADICIONAR\n"
				+ "NA LISTA", null, 
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	public boolean testeCardapio() {
		registro = new RegistrosDados();
		boolean testeCardapio = cadastra;
		
		String testando = null;
		for(int i = 0; i < 10; i++) {
		
			if(registro.listarCardapio()[i].getProdutos() != testando) {
				testeCardapio = true;
			}
		
		}
		
		return testeCardapio;
	}
}
=======
package tp3_tela;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;


import tp3_registros.*;

/**Exibe a tela ao clicar em um dos Produtos da Lista
 * @author Henrique Galdino
 * @verso 1.0
 * 
 * */
public class TelaCardapio implements ActionListener{
	private JFrame janela;
	
	private JLabel produto = new JLabel("Produto: ");
	private JTextField textProduto;
	private JLabel descricao = new JLabel("Descrição: ");
	private JTextField textDescricao;
	private JLabel preco = new JLabel("Preço: ");
	private JTextField textPreco;
	
	private JButton salvar;
	private JButton deletar =  new JButton("DELETAR");
	
	//Parte referente a busca de produto
	private JButton buscar = new JButton("BUSCAR");
	private JTextField produtoBusca = new JTextField(200);
	private JLabel titulo = new JLabel("INSIRA O NOME E CLIQUE NO BOTÃO");
	
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
	public void editarCardapio(int op, RegistrosDados r, TelaCadastros t, int ind) {
		
		opcao = op;
		registro = r;
		indice = ind;
		
		if(op == 1) nomeTela = "Cadastrar Produto";
		if(op == 2) nomeTela = "Dados do Produto";
		
		janela = new JFrame(nomeTela);
		
		if(op ==2) {//se for "editar"
			String precoProd;
			precoProd = String.valueOf(registro.listarCardapio()[indice].getPrecoProdutos());
			
			textProduto = new JTextField(registro.listarCardapio()[indice].getProdutos());
			textDescricao = new JTextField(registro.listarCardapio()[indice].getDescricaoProdutos());
			textPreco = new JTextField(precoProd);
			salvar = new JButton("SALVAR");
			
		}else {//se for "cadastrar"
			textProduto = new JTextField(200);
			textDescricao = new JTextField(200);
			textPreco = new JTextField(200);
			salvar =  new JButton("CADASTRAR");
			salvar.setForeground(Color.RED);
		}
		
		if (op == 1) {//se for "cadastrar"
			mensagemBotao();
			salvar.setBounds(140,50,140,140);
		}
		
		if (op == 2) {//se for "editar"
			produto.setBounds(30, 20, 150, 25);
			textProduto.setBounds(180, 20, 180, 25);
		
			descricao.setBounds(30, 40, 150, 25);
			textDescricao.setBounds(180, 40, 180, 25);
		
			preco.setBounds(30, 60, 150, 25);
			textPreco.setBounds(180, 60, 180, 25);
			
			salvar.setBounds(120, 175, 115, 30);
			salvar.setForeground(Color.BLUE);
			deletar.setBounds(245, 175, 115, 30);
			deletar.setForeground(Color.RED);
			this.janela.add(produto);
			this.janela.add(textProduto);
			this.janela.add(descricao);
			this.janela.add(textDescricao);
			this.janela.add(preco);
			this.janela.add(textPreco);
			this.janela.add(deletar);
		}
		
		
		this.janela.add(salvar);
		
		this.janela.setLayout(null);
		
		this.janela.setSize(500, 350);
		this.janela.setVisible(true);
		
		salvar.addActionListener(this);
		deletar.addActionListener(this);
	}
	
	/**
	 * Define a tela de busca para a lista de Clientes
	 * 
	 * @return Tela referente a ação que o usuário escolheu
	 */
	public void buscaProduto() {
		janela = new JFrame("Busca produto");
		
		produtoBusca.setBounds(140, 60, 180, 25);
		buscar.setBounds(180, 100, 110, 30);
		titulo.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		titulo.setBounds(60, 10,350, 30);
		
		this.janela.setLayout(null);
		
		this.janela.setSize(500, 200);
		this.janela.setVisible(true);
		this.janela.add(produtoBusca);
		this.janela.add(buscar);
		this.janela.add(titulo);
		
		buscar.addActionListener(this);
	}
	
	/**
	 * Verifica e define o que acontece quando cada um dos botões é ativado
	 * 
	 * @param e, que verifica qual dos botões foi acionado
	 * @return a mensagem referente a ação que se originou através da ativação do botão
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == salvar) {
			
			@SuppressWarnings("unused")
			boolean cadastra;
			
			if(opcao == 1) { //cadastrar itens no cardapio
				dado[0] = Integer.toString(registro.itensCardapio());
				
				dado[1] = textProduto.getText();
				dado[2] = textDescricao.getText();
				dado[3] = textPreco.getText();
				
				cadastra = registro.cadCardapio(dado);
				
				mensagemCardapioCadastrado();
			}else { //editar itens no cardapio
				dado[0] = Integer.toString(indice);
				
				dado[1] = textProduto.getText();
				dado[2] = textDescricao.getText();
				dado[3] = textPreco.getText();
				
				dado[3].replaceAll(",", ".");
				double novoPreco = Double.parseDouble(dado[3]);
				registro.listarCardapio()[indice].setProdutos(dado[1]);
				registro.listarCardapio()[indice].setDescricaoProdutos(dado[2]);
				registro.listarCardapio()[indice].setPrecoProdutos(novoPreco);
				mensagemCardapioSucesso();
			}
			
				
		}
		
		if(src == deletar) {
			
			if(opcao == 2) { //excluir item do cardapio
				
				if(indice == (registro.itensCardapio() - 1)) { //Se for a última bebida da lista
					
					registro.listarCardapio()[indice] = null;
					registro.getDados().setTotalCardapio(registro.getDados().getTotalCardapio() - 1);
					
	
				}else {
					String produtoDeletar = registro.listarCardapio()[indice].getProdutos();
					
					int contador = 0;
					while(registro.listarCardapio()[contador].getProdutos().compareTo(produtoDeletar) != 0) {
						contador++;
					}
						
						for(int i = contador; i < registro.itensCardapio(); i++) {
							registro.listarCardapio()[i] = null;
							registro.listarCardapio()[i] = registro.listarCardapio()[i + 1];
						}
						registro.listarCardapio()[registro.itensCardapio()] = null;
						registro.getDados().setTotalCardapio(registro.getDados().getTotalCardapio() - 1);
				
				}
				
				mensagemCardapioDeletado();
			}
		}
		
		if(src == buscar) {
			RegistrosDados buscarRegistro = new RegistrosDados();
	
			for(int i = 0; i< buscarRegistro.qtdClientes(); i++) {
				
				if(produtoBusca.getText().equalsIgnoreCase(buscarRegistro.listarCardapio()[i].getProdutos())) {
					editarCardapio(2, buscarRegistro, null, i);
					janela.remove(salvar);
					janela.remove(deletar);
				}
			}
		}
	}
	

	/**
	 * Mensagem que é exibida quando os dados do produto são editados
	 * @return janela com texto "ITEM EDITADO COM SUCESSO"
	 */
	public void mensagemCardapioSucesso() {//quando edita com sucesso
		JOptionPane.showMessageDialog(null, "ITEM EDITADO COM SUCESSO", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	
	/**
	 * Mensagem que é exibida quando os dados do produto são deletados
	 * @return janela com texto "ITEM DELETADO COM SUCESSO"
	 */
	public void mensagemCardapioDeletado() {//quando deleta com sucesso
		JOptionPane.showMessageDialog(null, "ITEM DELETADO COM SUCESSO", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	
	/**
	 * Mensagem que é exibida quando o produto é cadastrado e adiconado a lista
	 * @return janela com texto "PRODUTO ADICIONADO A LISTA FAVOR ATUALIZAR A LISTA E INSERIR OS DADOS"
	 */
	public void mensagemCardapioCadastrado() {//quando cadastra com sucesso
		JOptionPane.showMessageDialog(null, "PRODUTO ADICONADO A LISTA\n"
				+ "FAVOR ATUALIZAR A LISTA E INSERIR OS DADOS", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	
	/**
	 * Mensagem que é exibida quando o botão "cadastrar" é ativado na janela que contém a lista
	 * @return janela com texto "CLIQUE NO BOTAO PARA ADICIONAR"
	 */
	public void mensagemBotao() {//mensagem quando botao "cadastrar" for ativado
		JOptionPane.showMessageDialog(null, "CLIQUE NO BOTAO PARA ADICIONAR\n"
				+ "NA LISTA", null, 
				JOptionPane.INFORMATION_MESSAGE);
	}
}
>>>>>>> 55ed07721f6cebbfc70f10922c03996006eb03af

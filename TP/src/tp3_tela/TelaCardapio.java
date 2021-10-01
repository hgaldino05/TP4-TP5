package tp3_tela;


import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;


import tp3_registros.*;

//classe referente a parte grafica do cardapio
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
	
	private static RegistrosDados registro;
	private int indice;
	private int opcao;
	private String nomeTela;
	private String[] dado = new String[20];
	
	public void editarCardapio(int op, RegistrosDados r, TelaCadastros t, int ind) {
		
		opcao = op;
		registro = r;
		indice = ind;
		
		if(op == 1) nomeTela = "Cadastrar Produto";
		if(op == 2) nomeTela = "Editar Produto";
		
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
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == salvar) {
			
			@SuppressWarnings("unused")
			boolean res;
			
			if(opcao == 1) { //cadastrar itens no cardapio
				dado[0] = Integer.toString(registro.itensCardapio());
				
				dado[1] = textProduto.getText();
				dado[2] = textDescricao.getText();
				dado[3] = textPreco.getText();
				
				res = registro.cadCardapio(dado);
				
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
	}
	
	//quando edita com sucesso
	public void mensagemCardapioSucesso() {
		JOptionPane.showMessageDialog(null, "ITEM EDITADO COM SUCESSO", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	
	//quando deleta com sucesso
	public void mensagemCardapioDeletado() {
		JOptionPane.showMessageDialog(null, "ITEM DELETADO COM SUCESSO", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	
	//quando cadastra com sucesso
	public void mensagemCardapioCadastrado() {
		JOptionPane.showMessageDialog(null, "PRODUTO ADICONADO A LISTA\n"
				+ "FAVOR ATUALIZAR A LISTA E INSERIR OS DADOS", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	
	//mensagem quando botao "cadastrar" for ativado
	public void mensagemBotao() {
		JOptionPane.showMessageDialog(null, "CLIQUE NO BOTAO PARA ADICIONAR\n"
				+ "NA LISTA", null, 
				JOptionPane.INFORMATION_MESSAGE);
	}
}

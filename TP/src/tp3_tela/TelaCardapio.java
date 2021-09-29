package tp3_tela;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

import tp3_registros.*;

public class TelaCardapio implements ActionListener{
	private JFrame janela;
	
	private JLabel produto = new JLabel("Produto: ");
	private JTextField textProduto;
	private JLabel descricao = new JLabel("Descrição: ");
	private JTextField textDescricao;
	private JLabel preco = new JLabel("Preço: ");
	private JTextField textPreco;
	
	private JButton salvar =  new JButton("SALVAR");
	private JButton deletar =  new JButton("DELETAR");
	
	private static RegistrosDados registro;
	private int indice;
	private int opcao;
	private String nomeTela;
	
	public void editarCardapio(int op, RegistrosDados r, TelaCadastros t, int ind) {
		
		opcao = op;
		registro = r;
		indice = ind;
		
		if(op == 1) nomeTela = "Cadastrar Produto";
		if(op == 2) nomeTela = "Editar Produto";
		
		janela = new JFrame(nomeTela);
		
		if(op ==2) {
			String precoProd;
			precoProd = String.valueOf(registro.listarCardapio()[indice].getPrecoProdutos());
			
			textProduto = new JTextField(registro.listarCardapio()[indice].getProdutos());
			textDescricao = new JTextField(registro.listarCardapio()[indice].getDescricaoProdutos());
			textPreco = new JTextField(precoProd);
			
			
		}else {
			textProduto = new JTextField(200);
			textDescricao = new JTextField(200);
			textPreco = new JTextField(200);
			
			salvar.setBounds(245, 190, 120, 20);
		}
		
		if (op == 1 || op == 2 ) {
			produto.setBounds(30, 20, 150, 25);
			textProduto.setBounds(180, 20, 180, 25);
		
			descricao.setBounds(30, 40, 150, 25);
			textDescricao.setBounds(180, 40, 180, 25);
		
			preco.setBounds(30, 60, 150, 25);
			textPreco.setBounds(180, 60, 180, 25);
		}
		
		if (op == 2) {
			salvar.setBounds(120, 175, 115, 30);
			deletar.setBounds(245, 175, 115, 30);
			this.janela.add(deletar);
		}
		
		this.janela.add(produto);
		this.janela.add(textProduto);
		this.janela.add(descricao);
		this.janela.add(textDescricao);
		this.janela.add(preco);
		this.janela.add(textPreco);
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

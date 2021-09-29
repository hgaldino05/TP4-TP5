package tp3_tela;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

import tp3_registros.*;
public class TelaVenda implements ActionListener{
	private JFrame janela;
	
	private JLabel valor = new JLabel("Valor: ");
	private JTextField textValor;
	private JLabel produtoPedido = new JLabel("Produto pedido: ");
	private JTextField textProduto;
	private JLabel qtdProduto = new JLabel("quantidade: ");
	private JTextField textQtdProduto;
	private JLabel pagamento = new JLabel("Forma de pagamento: ");
	private JTextField textPagamento;
	private JLabel cliente =  new JLabel("Cliente: ");
	private JTextField textCliente;
	private JLabel vendedor = new JLabel("Vendedor: ");
	private JTextField textVendedor;
	private JLabel data =  new JLabel("Data: ");
	private JTextField textData;
	
	private JButton salvar =  new JButton("SALVAR");
	private JButton Cadastrar =  new JButton("DELETAR");
	
	private static RegistrosDados registro;
	private int indice;
	private int opcao;
	private String nomeTela;
	
	public void cadastrarVenda(int op, RegistrosDados r, TelaCadastros t, int ind) {
		
		opcao = op;
		registro = r;
		indice = ind;
		
		if(op == 0) nomeTela = "Cadastrar Venda";
		
		janela = new JFrame(nomeTela);
		
		if(op == 0) {
			textValor = new JTextField(200);
			textProduto = new JTextField(200);
			textQtdProduto = new JTextField(200);
			textPagamento = new JTextField(200);
			textCliente = new JTextField(200);
			textVendedor = new JTextField(200);
			textVendedor = new JTextField(200);
			
			salvar.setBounds(245, 175, 115, 30);
		}
		
		if(op == 0) {
		valor.setBounds(30, 20, 150, 25);
		textValor.setBounds(180, 20, 180, 25);
		produtoPedido.setBounds(30, 50, 150, 25);
		textProduto.setBounds(180, 50, 180, 25);
		qtdProduto.setBounds(30, 50, 180, 25);
		textQtdProduto.setBounds(180, 50, 180, 25);		
		pagamento.setBounds(30, 80, 150, 25);
		textPagamento.setBounds(180, 80, 180, 25);
		cliente.setBounds(30, 110, 150, 25);
		textCliente.setBounds(180, 110, 180, 25);
		vendedor.setBounds(30, 140, 150, 25);
		textVendedor.setBounds(180, 140, 180, 25);
		}
		this.janela.add(valor);
		this.janela.add(textValor);
		this.janela.add(produtoPedido);
		this.janela.add(textProduto);
		this.janela.add(qtdProduto);
		this.janela.add(textQtdProduto);
		this.janela.add(pagamento);
		this.janela.add(textPagamento);
		this.janela.add(cliente);
		this.janela.add(textCliente);
		this.janela.add(vendedor);
		this.janela.add(textVendedor);
		
		this.janela.setLayout(null);

		this.janela.setSize(400, 250);
		this.janela.setVisible(true);

		salvar.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == salvar) {
			
		}
	}	
	public void mensagemErroProduto() {
		JOptionPane.showMessageDialog(null, "O produto informado não está cadastrado no sistema!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	
	public void mensagemErroCliente() {
		JOptionPane.showMessageDialog(null, "O cliente informado não está cadastrado no sistema!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	
	public void mensagemErroColaborador() {
		JOptionPane.showMessageDialog(null, "O colaborador informado não está cadastrado no sistema!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	
	public void mensagemErroSabor() {
		JOptionPane.showMessageDialog(null, "O sabor informado não está cadastrado no sistema!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
}

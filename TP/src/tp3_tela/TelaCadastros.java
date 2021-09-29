package tp3_tela;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

import tp3_registros.*;

public class TelaCadastros implements ActionListener, ListSelectionListener{
	private JFrame janela;
	private JLabel titulo;
	private JButton botao;
	/*private JButton pastel;
	private JButton cliente;
	private JButton colaborador;*/
	
	private JList<String> pastelCadastrado;
	private JList<String> bebidaCadastrada;
	private JList<String> clienteCadastrado;
	private JList<String> colaboradorCadastrado;
	private JList<String> cardapioCadastrado;
	private JList<String> vendaCadastrada;
	
	private String[] listagem = new String[99];
	private static RegistrosDados registro;
	
	
	public void tela(RegistrosDados r,int listar) {
		registro = r;
		
		switch(listar) {
			case 1: //Bebidas
				listagem = new ManipulaDados(registro).getListaBebida();
				
				
				bebidaCadastrada = new JList<String>(listagem);
				janela = new JFrame("Bebidas");
				titulo = new JLabel("Sabores de bebidas");
				botao = new JButton("Bebida Teste");
				
				titulo.setFont(new Font("Bahnschrift", Font.BOLD, 20));
				titulo.setBounds(90, 10, 250, 30);
				
				bebidaCadastrada.setBounds(20, 50, 300, 220);
				bebidaCadastrada.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				bebidaCadastrada.setVisibleRowCount(10);
				
				botao.setBounds(70, 177, 100, 30);
				
				janela.setLayout(null);
				
				janela.add(titulo);
				janela.add(bebidaCadastrada);	
				
				janela.setSize(400, 350);
				janela.setVisible(true);
				
				botao.addActionListener(this);
				bebidaCadastrada.addListSelectionListener(this);
				break;
				
			case 2: //Pastéis
				listagem = new ManipulaDados(registro).getListaPastel();
				
				pastelCadastrado = new JList<String>(listagem);
				janela = new JFrame("Pastéis");
				titulo = new JLabel("Sabores de Pastéis");
				botao = new JButton("Pastel Teste");
				
				titulo.setFont(new Font("Bahnschrift", Font.BOLD, 20));
				titulo.setBounds(90, 10, 250, 30);
				
				pastelCadastrado.setBounds(20, 50, 300, 220);
				pastelCadastrado.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				pastelCadastrado.setVisibleRowCount(10);
				

				botao.setBounds(70, 177, 100, 30);
				
				janela.setLayout(null);
				
				janela.add(titulo);
				janela.add(pastelCadastrado);	
				
				janela.setSize(400, 350);
				janela.setVisible(true);
				
				botao.addActionListener(this);
				pastelCadastrado.addListSelectionListener(this);
				break;
				
			case 3: //Clientes
				listagem =  new ManipulaDados(registro).getListaCliente();
				
				clienteCadastrado = new JList<String>(listagem);
				janela = new JFrame("Clientes");
				titulo = new JLabel("Lista de Clientes");
				botao = new JButton("Cliente Teste");
				
				titulo.setFont(new Font("Bahnschrift", Font.BOLD, 20));
				titulo.setBounds(90, 10, 250, 30);
				
				clienteCadastrado.setBounds(20, 50, 300, 220);
				clienteCadastrado.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				clienteCadastrado.setVisibleRowCount(10);
				
				botao.setBounds(70, 177, 100, 30);
				
				janela.setLayout(null);
				
				janela.add(titulo);
				janela.add(clienteCadastrado);	
				
				janela.setSize(400, 350);
				janela.setVisible(true);
				
				botao.addActionListener(this);
				clienteCadastrado.addListSelectionListener(this);
				break;
			
			case 4: //Colaboradores
				listagem =  new ManipulaDados(registro).getListaColaborador();
				
				colaboradorCadastrado = new JList<String>(listagem);
				janela = new JFrame("Colaboradores");
				titulo = new JLabel("Lista de Colaboradores");
				botao = new JButton("Colaborador Teste");
				
				titulo.setFont(new Font("Bahnschrift", Font.BOLD, 20));
				titulo.setBounds(90, 10, 250, 30);
				
				colaboradorCadastrado.setBounds(20, 50, 300, 220);
				colaboradorCadastrado.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				colaboradorCadastrado.setVisibleRowCount(10);
				
				botao.setBounds(70, 177, 100, 30);
				
				janela.setLayout(null);
				
				janela.add(titulo);
				janela.add(colaboradorCadastrado);	
				
				janela.setSize(400, 350);
				janela.setVisible(true);
				
				botao.addActionListener(this);
				colaboradorCadastrado.addListSelectionListener(this);
				break;
			case 5: //Cardápio
				listagem =  new ManipulaDados(registro).getItensCardapio();
				
				cardapioCadastrado = new JList<String>(listagem);
				janela = new JFrame("Cardápio");
				titulo = new JLabel("Itens do Cardápio");
				botao = new JButton("Cardápio Teste");
				
				titulo.setFont(new Font("Bahnschrift", Font.BOLD, 20));
				titulo.setBounds(90, 10, 250, 30);
				
				cardapioCadastrado.setBounds(20, 50, 300, 220);
				cardapioCadastrado.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				cardapioCadastrado.setVisibleRowCount(10);
				
				botao.setBounds(70, 177, 100, 30);
				
				janela.setLayout(null);
				
				janela.add(titulo);
				janela.add(cardapioCadastrado);	
				
				janela.setSize(400, 350);
				janela.setVisible(true);
				
				botao.addActionListener(this);
				cardapioCadastrado.addListSelectionListener(this);
				break;
			case 6: //Venda
				listagem =  new ManipulaDados(registro).getListaVendas();
				
				vendaCadastrada = new JList<String>(listagem);
				janela = new JFrame("Vendas");
				titulo = new JLabel("Vendas Registradas");
				botao = new JButton("Vendas Teste");
				
				titulo.setFont(new Font("Bahnschrift", Font.BOLD, 20));
				titulo.setBounds(90, 10, 250, 30);
				
				vendaCadastrada.setBounds(20, 50, 370, 220);
				vendaCadastrada.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				vendaCadastrada.setVisibleRowCount(10);
				
				botao.setBounds(70, 177, 100, 30);
				
				janela.setLayout(null);
				
				janela.add(titulo);
				janela.add(vendaCadastrada);	
				
				janela.setSize(500, 350);
				janela.setVisible(true);
				
				botao.addActionListener(this);
				vendaCadastrada.addListSelectionListener(this);
				break;
		}
	}


	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		
		if(e.getValueIsAdjusting() && src == bebidaCadastrada) {
			new TelaBebidaPastel().editarBebidaPastel(2, registro, this, bebidaCadastrada.getSelectedIndex());
		}
		
		if(e.getValueIsAdjusting() && src == pastelCadastrado) {
			new TelaBebidaPastel().editarBebidaPastel(4, registro, this, pastelCadastrado.getSelectedIndex());
		}
		
		if(e.getValueIsAdjusting() && src == clienteCadastrado) {
			new TelaClienteColaborador().editarClienteColaborador(2, registro, this, clienteCadastrado.getSelectedIndex());
		}
		
		if(e.getValueIsAdjusting() && src == colaboradorCadastrado) {
			new TelaClienteColaborador().editarClienteColaborador(4, registro, this, colaboradorCadastrado.getSelectedIndex());
		}
		if(e.getValueIsAdjusting() && src == cardapioCadastrado) {
			new TelaCardapio().editarCardapio(2, registro, this, cardapioCadastrado.getSelectedIndex());
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}

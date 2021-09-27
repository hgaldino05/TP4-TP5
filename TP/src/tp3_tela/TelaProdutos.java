package tp3_tela;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

import tp3_registros.*;

public class TelaProdutos implements ActionListener, ListSelectionListener{
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
				
				bebidaCadastrada.setBounds(20, 50, 150, 220);
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
				
			case 2: //Past�is
				listagem = new ManipulaDados(registro).getListaPastel();
				
				pastelCadastrado = new JList<String>(listagem);
				janela = new JFrame("Past�is");
				titulo = new JLabel("Sabores de Past�is");
				botao = new JButton("Pastel Teste");
				
				titulo.setFont(new Font("Bahnschrift", Font.BOLD, 20));
				titulo.setBounds(90, 10, 250, 30);
				
				pastelCadastrado.setBounds(20, 50, 220, 220);
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
				
				clienteCadastrado.setBounds(20, 50, 220, 220);
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
				
				colaboradorCadastrado.setBounds(20, 50, 220, 220);
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
			case 5: //Card�pio
				listagem =  new ManipulaDados(registro).getItensCardapio();
				
				cardapioCadastrado = new JList<String>(listagem);
				janela = new JFrame("Card�pio");
				titulo = new JLabel("Itens do Card�pio");
				botao = new JButton("Card�pio Teste");
				
				titulo.setFont(new Font("Bahnschrift", Font.BOLD, 20));
				titulo.setBounds(90, 10, 250, 30);
				
				cardapioCadastrado.setBounds(20, 50, 270, 220);
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
				
				vendaCadastrada.setBounds(20, 50, 270, 220);
				vendaCadastrada.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				vendaCadastrada.setVisibleRowCount(10);
				
				botao.setBounds(70, 177, 100, 30);
				
				janela.setLayout(null);
				
				janela.add(titulo);
				janela.add(vendaCadastrada);	
				
				janela.setSize(400, 350);
				janela.setVisible(true);
				
				botao.addActionListener(this);
				vendaCadastrada.addListSelectionListener(this);
				break;
		}
	}


	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

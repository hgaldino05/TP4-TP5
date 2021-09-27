package tp3_tela;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import tp3_registros.RegistrosDados;




public class Principal implements ActionListener{

	private static JFrame janela = new JFrame("TESTE");
	private static JLabel titulo = new JLabel("TESTE");
	private static JButton botao1 = new JButton("BEBIDAS");
	private static JButton botao2 = new JButton("PAST�IS");
	private static JButton botao3 = new JButton("CLIENTES");
	private static JButton botao4 = new JButton("COLABORADORES");
	private static JButton botao5 = new JButton("CARD�PIO");
	private static JButton botao6 = new JButton("VENDAS");
	
	public static RegistrosDados registro =  new RegistrosDados();
	
	public Principal(){
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(210, 10, 150, 30);
		
		botao1.setFont(new Font("Calibri", Font.ITALIC, 16));
		botao2.setFont(new Font("Calibri", Font.ITALIC, 16));
		botao3.setFont(new Font("Calibri", Font.ITALIC, 16));
		botao4.setFont(new Font("Calibri", Font.ITALIC, 16));
		botao5.setFont(new Font("Calibri", Font.ITALIC, 16));
		botao6.setFont(new Font("Calibri", Font.ITALIC, 16));

		botao1.setBounds(50, 100, 150, 30);
		botao2.setBounds(50, 150, 150, 30);
		botao3.setBounds(50, 200, 150, 30);
		botao4.setBounds(250, 100, 150, 30);
		botao5.setBounds(250, 150, 150, 30);
		botao6.setBounds(250, 200, 150, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(botao1);
		janela.add(botao2);
		janela.add(botao3);
		janela.add(botao4);
		janela.add(botao5);
		janela.add(botao6);
		
		janela.setSize(500, 500);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		Principal menu = new Principal();
		
		botao1.addActionListener(menu);
		botao2.addActionListener(menu);
		botao3.addActionListener(menu);
		botao4.addActionListener(menu);
		botao5.addActionListener(menu);
		botao6.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == botao1) {
			new TelaProdutos().tela(registro, 1);
		}
		
		if(src == botao2) {
			new TelaProdutos().tela(registro, 2);
		}
		
		if(src == botao3) {
			new TelaProdutos().tela(registro, 3);
		}
		
		if(src == botao4) {
			new TelaProdutos().tela(registro, 4);
		}
		
		if(src == botao5) {
			new TelaProdutos().tela(registro, 5);
		}
		
		if(src == botao6) {
			new TelaProdutos().tela(registro, 6);
		}
		
	}
}

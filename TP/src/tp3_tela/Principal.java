package tp3_tela;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import tp3_registros.RegistrosDados;



//classe que roda a parte grafica do programa
public class Principal implements ActionListener{

	//atributos referentes a janela inicial do programa
	private static JFrame janela = new JFrame("SISTEMA");
	private static JLabel titulo = new JLabel("PASTELARIA");
	private static JButton botao1 = new JButton("BEBIDAS");
	private static JButton botao2 = new JButton("PASTÉIS");
	private static JButton botao3 = new JButton("CLIENTES");
	private static JButton botao4 = new JButton("COLABORADORES");
	private static JButton botao5 = new JButton("CARDÁPIO");
	private static JButton botao6 = new JButton("VENDAS");
	
	public static RegistrosDados registro =  new RegistrosDados();
	
	public Principal(){
		titulo.setFont(new Font("Ebrima", Font.BOLD, 20));
		titulo.setBounds(165, 40, 150, 30);
		
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
		
		//abre a JList de bebidas
		if(src == botao1) {
			new TelaCadastros().tela(registro, 1);
		}
		
		//abre a JList de pasteis
		if(src == botao2) {
			new TelaCadastros().tela(registro, 2);
		}
		
		//abre a JList de clientes
		if(src == botao3) {
			new TelaCadastros().tela(registro, 3);
		}
		
		//abre a JList de colaboradores
		if(src == botao4) {
			new TelaCadastros().tela(registro, 4);
		}
		
		//abre a JList do cardapio
		if(src == botao5) {
			new TelaCadastros().tela(registro, 5);
		}
		
		//abre a JList de vendas
		if(src == botao6) {
			new TelaCadastros().tela(registro, 6);
		}
		
	}
}

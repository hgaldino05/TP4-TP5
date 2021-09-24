package tp3_tela;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class Principal implements ActionListener{

	private static JFrame janela = new JFrame("TESTE");
	private static JLabel titulo = new JLabel("TESTE");
	private static JButton botao1 = new JButton("BOTAO 1");
	private static JButton botao2 = new JButton("BOTAO 2");
	private static JButton botao3 = new JButton("BOTAO 3");
	
	public Principal(){
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(210, 10, 150, 30);
		
		botao1.setBounds(200, 100, 100, 30);
		botao2.setBounds(200, 150, 100, 30);
		botao3.setBounds(200, 200, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(botao1);
		janela.add(botao2);
		janela.add(botao3);
		
		janela.setSize(500, 500);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		Principal menu = new Principal();
		
		botao1.addActionListener(menu);
		botao2.addActionListener(menu);
		botao3.addActionListener(menu);
	
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == botao1) {
			new TelaProdutos().tela(null, 1);;
		}
		
	}
}

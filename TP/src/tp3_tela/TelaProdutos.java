package tp3_tela;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

import tp3_registros.*;

public class TelaProdutos implements ActionListener, ListSelectionListener{
	private JFrame janela;
	private JLabel titulo;
	/*private JButton pastel;
	private JButton bebida;
	private JButton cliente;
	private JButton colaborador;*/
	
	private JList<String> pastelCadastrado;
	private JList<String> bebidaCadastrada;
	private JList<String> clienteCadastrado;
	private JList<String> colaboradorCadastrado;
	private String[] listagem = new String[99];
	private static RegistrosDados registro;
	
	
	public void tela(RegistrosDados r,int listar) {
		registro = r;
		
		switch(listar) {
			case 1:
				listagem = registro.getBebidaControle(r);
				bebidaCadastrada = new JList<String>(listagem);
				janela = new JFrame("Bebidas");
				titulo = new JLabel("Lista de bebidas");
				
				titulo.setFont(new Font("Arial", Font.BOLD, 20));
				titulo.setBounds(90, 10, 250, 30);
				
				bebidaCadastrada.setBounds(20, 50, 350, 120);
				bebidaCadastrada.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				bebidaCadastrada.setVisibleRowCount(10);
				
				janela.setLayout(null);
				
				janela.add(titulo);
				janela.add(bebidaCadastrada);	
				
				janela.setSize(400, 250);
				janela.setVisible(true);
				
				break;
		}
	}
}

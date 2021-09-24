package tp3_dados;

import java.util.ArrayList;
import java.util.List;

//Classe "main"
public class Programa{
	

	private List<Bebida> bebida;
	private List<Pastel> pastel;
	private List<Cardapio> cardapio;
	private List<Cliente> cliente;
	private List<Colaborador> colaborador;
	private List<Venda> venda;
	private List<RelatorioVenda> relatorioVenda;	

	public void Registro(){
		
		bebida = new ArrayList<Bebida>();
		pastel = new ArrayList<Pastel>();
		cardapio = new ArrayList<Cardapio>();
		cliente = new ArrayList<Cliente>();
		colaborador = new ArrayList<Colaborador>();
		relatorioVenda = new ArrayList<RelatorioVenda>();
		venda = new ArrayList<Venda>();
		
		preCadastros();
		cardapioCadastrado();
		vendaCadastrada();
		relatorioCadastrado();
		
	}
	
	
	
	/*private void opcoes() {
		System.out.println("O que deseja acessar?:");
		System.out.println("1 - Exibir dados cadastrados");
		System.out.println("2 - Editar dados cadastrados");
		System.out.println("3 - Cadastrar novos dados");
		System.out.println("7 - Sair");
	}*/
	
	//Dados do Cardápio
	public void cardapioCadastrado() {
		for(int i = 0; i < 10; i++) {
			Cardapio ca = new Cardapio();
			
			if (i == 0) {
				ca.setProdutos("Pastel médio");
				ca.setDescricaoProdutos("Pastel médio, com recheio a escolha");
				ca.setPrecoProdutos(3.99);
				
				ca.setBebidas("Cerveja Latinha 269ml");
				ca.setDescricaoBebidas("Cerveja em Latinha 269ml");
				ca.setPrecoBebidas(2.99);
				
				ca.setCombos("Pastel em dobro");
				ca.setDescricaoCombos("Combo com 2 pastéis médios");
				ca.setPrecoCombos(7.49);
			}
			if (i == 1) {
				ca.setProdutos("Pastel Grande");
				ca.setDescricaoProdutos("Pastel grande, com recheio a escolha");
				ca.setPrecoProdutos(6.99);
				
				ca.setBebidas("Cerveja Lata 350ml");
				ca.setDescricaoBebidas("Cerveja  em Lata 350ml");
				ca.setPrecoBebidas(3.99);
				
				ca.setCombos("Pastel Grande em dobro");
				ca.setDescricaoCombos("Combo com 2 pastéis grandes");
				ca.setPrecoCombos(12.99);
			}
			if (i == 2) {
				ca.setProdutos("Mini pastel - 10 unidades");
				ca.setDescricaoProdutos("Cesto com 10 mini pastéis");
				ca.setPrecoProdutos(8.99);
				
				ca.setBebidas("Cerveja Long Neck 330ml");
				ca.setDescricaoBebidas("Cerveja em garrafa Long neck 330ml");
				ca.setPrecoBebidas(3.99);
				
				ca.setCombos("Matador de fome");
				ca.setDescricaoCombos("Combo com 10 mini pastéis + 1 pastel grande");
				ca.setPrecoCombos(14.99);
			}
			if (i == 3) {
				ca.setProdutos("Mini pastel - 5 unidades");
				ca.setDescricaoProdutos("Cesto com 5 mini pastéis");
				ca.setPrecoProdutos(4.99);
				
				ca.setBebidas("Cerveja Artesanal Garrafa 269ml");
				ca.setDescricaoBebidas("Cerveja Artesanal em garrafa 269ml");
				ca.setPrecoBebidas(4.49);
				
				ca.setCombos("Média 5");
				ca.setDescricaoCombos("Combo com 1 pastel médio + 5 mini pastéis");
				ca.setPrecoCombos(7.99);
			}
			if (i == 4) {
				ca.setProdutos("Coxinha");
				ca.setDescricaoProdutos("Salgado coxinha");
				ca.setPrecoProdutos(4.99);
				
				ca.setBebidas("Cerveja Artesanal Long Neck 350ml");
				ca.setDescricaoBebidas("Cerveja Artesanal Long Neck 350ml");
				ca.setPrecoBebidas(5.99);
				
				ca.setCombos("Delícia em dobro");
				ca.setDescricaoCombos("Combo com 1 pastel médio + 1 coxinha");
				ca.setPrecoCombos(7.99);
			}
			if (i == 5) {
				ca.setProdutos("Mini Coxinha - 10 unidades");
				ca.setDescricaoProdutos("Prato com 10 mini coxinhas");
				ca.setPrecoProdutos(9.99);
				
				ca.setBebidas("Chá Mate Leão 450ml");
				ca.setDescricaoBebidas("Chá Mate Leão, sabor Limão 450ml");
				ca.setPrecoBebidas(3.99);
				
				ca.setCombos("Família Coxinha");
				ca.setDescricaoCombos("Combo com 20 mini coxinhas");
				ca.setPrecoCombos(18.99);
			}
			if (i == 6) {
				ca.setProdutos("Batata Frita");
				ca.setDescricaoProdutos("Pote tamanho médio com Batata Frita");
				ca.setPrecoProdutos(3.99);

				ca.setBebidas("Refrigerante Lata 350ml");
				ca.setDescricaoBebidas("Refrigerante 350ml em Lata");
				ca.setPrecoBebidas(3.99);
				
				ca.setCombos("Pastel + Refri");
				ca.setDescricaoCombos("Combo com 1 pastel médio + 1 lata de refri 350ml");
				ca.setPrecoCombos(6.99);
			}
			if (i == 7) {
				ca.setProdutos("Batata Frita Grande");
				ca.setDescricaoProdutos("Pote tamanho grande com Batata Frita");
				ca.setPrecoBebidas(7.99);
				
				ca.setBebidas("Refrigerante PET 600ml");
				ca.setDescricaoBebidas("Refrigerante 600ml em garrafa PET");
				ca.setPrecoBebidas(6.49);
				
				ca.setCombos("Matador de Fome 2");
				ca.setDescricaoCombos("Combo com 1 pastel grande + 1 garrafa de refri 600ml");
				ca.setPrecoCombos(12.49);
			}
			if (i == 8) {
				ca.setProdutos("Batata Frita c/ Cheddar e Bacon");
				ca.setDescricaoProdutos("Pote tamanho médio com Batata Frita c/ Cheddar e Bacon");
				ca.setPrecoProdutos(5.99);
				
				ca.setBebidas("Suco Natural 300ml");
				ca.setDescricaoBebidas("Suco feito da fruta ou da polpa");
				ca.setPrecoBebidas(4.25);
				
				ca.setCombos("Pastel e suco");
				ca.setDescricaoCombos("Combo com 1 pastel médio + 1 copo de suco natural 300ml ");
				ca.setPrecoCombos(12.99);
			}
			if (i == 9) {
				ca.setProdutos("Batata Frita c/ Cheddar e Bacon Grande");
				ca.setDescricaoProdutos("Pote tamanho grande com Batata Frita c/ Cheddar e Bacon");
				ca.setPrecoProdutos(11.99);
				
				ca.setBebidas("Cerveja Latinha 269ml");
				ca.setDescricaoBebidas("Cerveja Latinha 269ml");
				ca.setPrecoBebidas(2.99);
				
				ca.setCombos("Clássico");
				ca.setDescricaoCombos("Combo com 1 Pastel médio + 1 copo de caldo de cana");
				ca.setPrecoCombos(7.99);
			}
			
			cardapio.add(ca);
		}
	}
	//Dados pré-cadastrados
	public void preCadastros(){
		
		for(int i = 0; i < 10; i++) {
			
		Bebida b = new Bebida();
		Pastel p = new Pastel();
		Cliente cl = new Cliente();
		Colaborador co = new Colaborador();
		
			if(i == 0) {
				
				b.setSabor("Coca-cola");
				b.setEstoque(50);
				
				p.setSabor("Queijo");
				p.setEstoque(50);
				
				cl.setCPF("123.456.789-10");
				cl.setNome("Yudi Playstation");
				cl.setTelefone("4002-8922");
				cl.setPontuacao(120);
				
				co.setNome("Cleiton Rasta");
				co.setID("0001.2019");
				co.setDataEntrada("15/8/2019");
								
			}
			
			if(i == 1) {
				
				b.setSabor("Guaraná");
				b.setEstoque(50);
				
				p.setSabor("Carne");
				p.setEstoque(50);
				
				cl.setCPF("555.666.777-88");
				cl.setNome("Neymar Jr");
				cl.setTelefone("5555-0000");
				cl.setPontuacao(150);
				
				co.setNome("Fulana Costa");
				co.setID("0002.2019");
				co.setDataEntrada("16/8/2021");
				
			}
			
			if(i == 2) {
				
				b.setSabor("Fanta laranja");		
				b.setEstoque(50);
				
				p.setSabor("Carne e queijo");
				p.setEstoque(50);
				
				cl.setCPF("111.222.333-44");
				cl.setNome("Anônimo da Silva");
				cl.setTelefone("1234-4321");
				cl.setPontuacao(80);
				
				co.setNome("Patrick Vieira");
				co.setID("0003.2019");
				co.setDataEntrada("16/8/2019");
				
			}
			
			if(i == 3) {
				
				b.setSabor("Sprite");
				b.setEstoque(50);
				
				p.setSabor("Frango");
				p.setEstoque(50);
				
				cl.setCPF("777.888.999-00");
				cl.setNome("Alan Silva");
				cl.setTelefone("0000-0000");
				cl.setPontuacao(200);
				
				co.setNome("Rogerinho do Querô");
				co.setID("0004.2019");
				co.setDataEntrada("25/11/2019");
				
			}
			
			if(i == 4) {
				
				b.setSabor("Suco de acerola");
				b.setEstoque(50);
				
				p.setSabor("Frango com queijo");
				p.setEstoque(50);
				
				cl.setCPF("098.765.432-10");
				cl.setNome("Felipe Smith");
				cl.setTelefone("9090-1010");
				cl.setPontuacao(140);
				
				co.setNome("Fausto Silva");
				co.setID("0005.2020");
				co.setDataEntrada("5/4/2020");
				
			}
			
			if(i == 5) {
				
				b.setSabor("Suco de goiaba");
				b.setEstoque(50);
				
				p.setSabor("Calabresa");
				p.setEstoque(50);
				
				cl.setCPF("123.321.213-00");
				cl.setNome("Maurício de Sousa");
				cl.setTelefone("5040-6070");
				cl.setPontuacao(115);
				
				co.setNome("Hiromu Arakawa");
				co.setID("0006.2020");
				co.setDataEntrada("5/4/2020");
				
			}
			
			if(i == 6) {
				
				b.setSabor("Suco de laranja");
				b.setEstoque(50);
				
				p.setSabor("Calabresa com queijo");
				p.setEstoque(50);
				
				cl.setCPF("192.837.465-54");
				cl.setNome("Maria Soares");
				cl.setTelefone("4545-5454");
				cl.setPontuacao(15);
				
				co.setNome("Alice Nunes");
				co.setID("0007.2020");
				co.setDataEntrada("9/6/2020");
				
			}
			
			if(i == 7) {
				
				b.setSabor("Suco de maracujá");
				b.setEstoque(50);
				
				p.setSabor("Pizza (Calabresa,Queijo,Orégano");
				p.setEstoque(50);
				
				cl.setCPF("303.404.505-66");
				cl.setNome("Fabio Lima");
				cl.setTelefone("7078-8089");
				cl.setPontuacao(0);
				
				co.setNome("Jeff Bezos");
				co.setID("0008.2021");
				co.setDataEntrada("12/1/2021");
				
			}
			
			if(i == 8) {
				
				b.setSabor("Suco de uva");
				b.setEstoque(50);
				
				p.setSabor("Brócolis");
				p.setEstoque(30);
				
				cl.setCPF("222.333.222-33");
				cl.setNome("Eduardo Suplicy");
				cl.setTelefone("6655-2020");
				cl.setPontuacao(1000);
				
				co.setNome("Ronaldinho Gaúcho");
				co.setID("0009.2021");
				co.setDataEntrada("2/5/2021");
				
			}
			
			if(i == 9) {
				
				b.setSabor("Caldo de Cana");
				b.setEstoque(70);
				
				p.setSabor("Coxinha");
				p.setEstoque(200);
				
				cl.setCPF("000.000.110-11");
				cl.setNome("Dwayne Johnson");
				cl.setTelefone("1333-3331");
				cl.setPontuacao(75);
				
				co.setNome("The Rock");
				co.setID("0010.2021");
				co.setDataEntrada("9/9/2021");
				
			}
			
			bebida.add(b);
			pastel.add(p);
			cliente.add(cl);
			colaborador.add(co);
		}
	}
	
	@SuppressWarnings("unused")
	public void vendaCadastrada() {
		for(int i = 0; i < 5; i++) {
			Venda v = new Venda();
		
			Cliente cl1 = cliente.get(0);
			Cliente cl2 = cliente.get(1);
			Cliente cl3 = cliente.get(2);
			Cliente cl4 = cliente.get(3);
			Cliente cl5 = cliente.get(4);
			
			Colaborador co1 = colaborador.get(5);
			Colaborador co2 = colaborador.get(6);
			Colaborador co3 = colaborador.get(7);
			Colaborador co4 = colaborador.get(8);
			Colaborador co5 = colaborador.get(9);
			
			Cardapio ca1 = cardapio.get(0);
			Cardapio ca2 = cardapio.get(1);
			Cardapio ca3 = cardapio.get(2);
			Cardapio ca4 = cardapio.get(3);
			Cardapio ca5 = cardapio.get(4);
			Cardapio ca6 = cardapio.get(5);
			Cardapio ca7 = cardapio.get(6);
			Cardapio ca8 = cardapio.get(7);
			Cardapio ca9 = cardapio.get(8);
			Cardapio ca10 = cardapio.get(9);
				
					if(i == 0) {
						v.setCliente(cl1.getNome());
						v.setVendedor(co1.getID());
						v.setProdutoPedido(ca1.getProdutos());
						v.setQtdProduto(2);
						v.setBebidaPedida(ca1.getBebidas());
						v.setQtdBebida(2);
						v.setValor((ca1.getPrecoProdutos() *v.getQtdProduto()) +(ca6.getPrecoBebidas() * v.getQtdBebida()));
						v.setFormaDePagamento("Pagamento via PIX");
					}
					if(i == 1) {
						v.setCliente(cl2.getNome());
						v.setVendedor(co4.getID());
						v.setProdutoPedido(ca7.getProdutos());
						v.setQtdProduto(1);
						v.setBebidaPedida(null);
						v.setQtdBebida(0);
						v.setValor((ca7.getPrecoProdutos() *v.getQtdProduto()) +(ca6.getPrecoBebidas() * v.getQtdBebida()));
						v.setFormaDePagamento("Dinheiro");
					}
					if(i == 2) {
						v.setCliente(cl5.getNome());
						v.setVendedor(co2.getID());
						v.setProdutoPedido(ca2.getProdutos());
						v.setQtdProduto(2);
						v.setBebidaPedida(ca2.getBebidas());
						v.setQtdBebida(1);
						v.setValor((ca2.getPrecoProdutos() *v.getQtdProduto()) +(ca2.getPrecoBebidas() * v.getQtdBebida()));
						v.setFormaDePagamento("Cartão de Débito");
					}
					if(i == 3) {
						v.setCliente(cl3.getNome());
						v.setVendedor(co3.getID());
						v.setProdutoPedido(ca3.getProdutos());
						v.setQtdProduto(3);
						v.setBebidaPedida(ca3.getBebidas());
						v.setQtdBebida(3);
						v.setValor((ca3.getPrecoProdutos() *v.getQtdProduto()) +(ca3.getPrecoBebidas() * v.getQtdBebida()));
						v.setFormaDePagamento("Cartão de Crédito");
					}
					if(i == 4) {
						v.setCliente(cl4.getNome());
						v.setVendedor(co5.getID());
						v.setProdutoPedido(ca6.getProdutos());
						v.setQtdProduto(2);
						v.setBebidaPedida(ca6.getBebidas());
						v.setQtdBebida(1);
						v.setValor((ca6.getPrecoProdutos() *v.getQtdProduto()) +(ca6.getPrecoBebidas() * v.getQtdBebida()));
						v.setFormaDePagamento("Pagamento via PIX");
					}
				
				
					
					
					venda.add(v);
				}
			}

	
	//Relatório pré-cadastrados
	public void relatorioCadastrado() {
		for(int i = 0; i < 5; i++) {
			RelatorioVenda r = new RelatorioVenda();
			Venda v = venda.get(i);
			
			if(i == 0) {
				r.setDataVenda("10/9/2021");
			}
			
			if(i == 1) {
				r.setDataVenda("9/9/2021");
			}
			
			if(i == 2) {
				r.setDataVenda("8/9/2021");
			}
			
			if(i == 3) {
				r.setDataVenda("10/9/2021");
			}
			
			if(i == 4) {
				r.setDataVenda("7/9/2021");
			}
			
			System.out.println("CLIENTE: " + v.getCliente());
			System.out.println("Vendedor: " + v.getVendedor());
			System.out.println("Data: " + r.getDataVenda());
			if(v.getProdutoPedido() == null) {
				System.out.println("Produto: SEM BEBIDA");
			}else {
				System.out.println("Produto: " + v.getProdutoPedido());
			}
			
			if(v.getQtdProduto() == 0) {
				
			}else {
				System.out.println("Quantidade: " + v.getQtdProduto());
			}
			
			if(v.getBebidaPedida() == null) {
				System.out.println("Bebida: SEM BEBIDA");
			}else {
				System.out.println("Bebida: " + v.getBebidaPedida());
			}
			
			if(v.getQtdBebida() == 0) {
			
			}else {
				System.out.println("Quantidade: " + v.getQtdBebida());
			}
			System.out.println("Forma de pagamento: " + v.getFormaDePagamento());
			System.out.println("Valor: " + v.getValor() + "\n");
			
			
			
			relatorioVenda.add(r);
		}
	}

	//Exibição dos dados
	public void exibir() {
		System.out.println("Bebidas cadastradas no sistema: ");
			for(int i = 0; i < bebida.size(); i++) {
				Bebida b = bebida.get(i);
			
				System.out.println("BEBIDA #" + (i+1) + ": " + b.getSabor());
			
				if(b.getSabor().contains("Suco")) {
					System.out.println("Opções: Copo com 300ml");
				}else if(b.getSabor().contains("Caldo")) {
					System.out.println("Opções: Copo com 300ml");
				}else {
					System.out.println("Latinha 350ml; Garrafa 600ml");
				}
				
				System.out.println("Quantidade em estoque: " + b.getEstoque() + "\n");
			}
			
		System.out.println("Pastéis cadastradas no sistema: ");
			for(int i = 0; i < pastel.size(); i++) {
				Pastel p = pastel.get(i);
			
				System.out.println("PASTEL #" + (i+1) + ": " + p.getSabor());
				System.out.println("Opções: Pastel Médio, Pastel Grande, Mini pastel, Coxinha, Mini Coxinha");
				System.out.println("Quantidade em estoque: " + p.getEstoque() + "\n");
			}
		
		System.out.println("Produtos cadastrados no sistema: ");
			for(int i = 0; i < cardapio.size(); i++) {
				Cardapio ca = cardapio.get(i);
				
				System.out.println("PRODUTO #" + (i+1) + ": " + ca.getProdutos());
				System.out.println("Preço: " + ca.getPrecoProdutos() + "\n");
			}
			
		System.out.println("Combos cadastrados no sistema: ");
			for(int i = 0; i < cardapio.size(); i++) {
				Cardapio ca = cardapio.get(i);
				
				System.out.println("COMBO #" + (i+1) + ": " + ca.getCombos());
				System.out.println("Preço: " + ca.getPrecoCombos());
				System.out.println(ca.getDescricaoCombos() + "\n");
			}
		
		System.out.println("Clientes cadastrados no sistema: ");
		for(int i = 0; i < cliente.size(); i++) {
			Cliente cl = cliente.get(i);
			
			System.out.println("Cliente #" + (i+1) + ": " + cl.getNome());
			System.out.println("Pontos: " + cl.getPontuacao());
			System.out.println("CPF: " + cl.getCPF() + "\n");
		}
		
		System.out.println("Colaboradores cadastrados no sistema: ");
		for(int i = 0; i < colaborador.size(); i++) {
			Colaborador co = colaborador.get(i);
			
			System.out.println("COLABORADOR #" + (i+1) + ": " + co.getID());
			System.out.println("Nome: " + co.getNome());
			System.out.println("Funcionário desde: " + co.getDataEntrada() + "\n");
	
		}
		
		for(int i = 0; i < venda.size(); i++) {
			Venda v = venda.get(i);
			
			System.out.println("CLIENTE: " + v.getCliente());
			System.out.println("Vendedor: " + v.getVendedor());
			System.out.println("Valor: " + v.getValor() + "\n");
		}
		
		System.out.println("Relatórios de Venda cadastrados no sistema: ");
		relatorioCadastrado();
	}
}
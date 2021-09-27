package tp3_dados;
import java.util.ArrayList;
import java.util.List;

public class Dados{
	private List<Bebida> bebida;
	private List<Pastel> pastel;
	private List<Cardapio> cardapio;
	private List<Cliente> cliente;
	private List<Colaborador> colaborador;
	private List<Venda> venda;

	
	private Bebida[] bebidaControle = new Bebida[99];
	private int totalBebidas = 0;
	private Pastel[] pastelControle = new Pastel[99];
	private int totalPasteis = 0;
	private Cliente[] clienteControle = new Cliente[99];
	private int totalClientes = 0;
	private Colaborador[] colaboradorControle = new Colaborador[99];
	private int totalColaboradores = 0;
	private Cardapio[] cardapioControle = new Cardapio[99];
	private int totalCardapio = 0;
	private Venda[] vendaControle = new Venda[99];
	private int totalVendas = 0;

	public void PreCadastrar() {
		bebida = new ArrayList<Bebida>();
		pastel = new ArrayList<Pastel>();
		cardapio = new ArrayList<Cardapio>();
		cliente = new ArrayList<Cliente>();
		colaborador = new ArrayList<Colaborador>();
		venda = new ArrayList<Venda>();
		
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
					
					b.setSabor("Guaran�");
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
					cl.setNome("An�nimo da Silva");
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
					
					co.setNome("Rogerinho do Quer�");
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
					cl.setNome("Maur�cio de Sousa");
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
					
					b.setSabor("Suco de maracuj�");
					b.setEstoque(50);
					
					p.setSabor("Pizza (Calabresa,Queijo e Or�gano)");
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
					
					p.setSabor("Br�colis");
					p.setEstoque(30);
					
					cl.setCPF("222.333.222-33");
					cl.setNome("Eduardo Suplicy");
					cl.setTelefone("6655-2020");
					cl.setPontuacao(1000);
					
					co.setNome("Ronaldinho Ga�cho");
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
		
		for(int i = 0; i < 10; i++) {
			Cardapio ca = new Cardapio();
			
			if (i == 0) {
				ca.setProdutos("Pastel m�dio");
				ca.setDescricaoProdutos("Pastel m�dio, com recheio a escolha");
				ca.setPrecoProdutos(3.99);
			}
			if (i == 1) {
				ca.setProdutos("Pastel Grande");
				ca.setDescricaoProdutos("Pastel grande, com recheio a escolha");
				ca.setPrecoProdutos(6.99);
				
			}
			if (i == 2) {
				ca.setProdutos("Mini pastel - 10 unidades");
				ca.setDescricaoProdutos("Cesto com 10 mini past�is");
				ca.setPrecoProdutos(8.99);
				;

			}
			if (i == 3) {
				ca.setProdutos("Cerveja Lata 350ml");
				ca.setDescricaoProdutos("Cerveja  em Lata 350ml");
				ca.setPrecoProdutos(3.99);
			}
			
			if (i == 4) {
				ca.setProdutos("Coxinha");
				ca.setDescricaoProdutos("Salgado coxinha");
				ca.setPrecoProdutos(4.99);
			}
			if (i == 5) {
				ca.setProdutos("Mini Coxinha - 10 unidades");
				ca.setDescricaoProdutos("Prato com 10 mini coxinhas");
				ca.setPrecoProdutos(9.99);
			}
			if (i == 6) {
				ca.setProdutos("Refrigerante Lata 350ml");
				ca.setDescricaoProdutos("Refrigerante 350ml em Lata");
				ca.setPrecoProdutos(3.99);

			}
			if (i == 7) {
				ca.setProdutos("Batata Frita");
				ca.setDescricaoProdutos("Pote tamanho grande com Batata Frita");
				ca.setPrecoProdutos(7.99);
				
				ca.setProdutos("Refrigerante PET 600ml");
				ca.setDescricaoProdutos("Refrigerante 600ml em garrafa PET");
				ca.setPrecoProdutos(6.49);

			}
			if (i == 8) {
				ca.setProdutos("Refrigerante PET 600ml");
				ca.setDescricaoProdutos("Refrigerante 600ml em garrafa PET");
				ca.setPrecoProdutos(6.49);
			}
			if (i == 9) {
				ca.setProdutos("Batata Frita c/ Cheddar e Bacon Grande");
				ca.setDescricaoProdutos("Pote tamanho grande com Batata Frita c/ Cheddar e Bacon");
				ca.setPrecoProdutos(11.99);
			}
			
			cardapio.add(ca);
		}
		
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
			
			@SuppressWarnings("unused")
			Cardapio ca4 = cardapio.get(3);
			
			@SuppressWarnings("unused")
			Cardapio ca5 = cardapio.get(4);
			Cardapio ca6 = cardapio.get(5);
			Cardapio ca7 = cardapio.get(6);
			
			@SuppressWarnings("unused")
			Cardapio ca8 = cardapio.get(7);
			
			@SuppressWarnings("unused")
			Cardapio ca9 = cardapio.get(8);
			
			@SuppressWarnings("unused")
			Cardapio ca10 = cardapio.get(9);
				
					if(i == 0) {
						v.setCliente(cl1.getNome());
						v.setVendedor(co1.getID());
						v.setProdutoPedido(ca1.getProdutos());
						v.setQtdProduto(2);
						v.setValor( (ca1.getPrecoProdutos() *v.getQtdProduto() ) );
						v.setFormaDePagamento("Pagamento via PIX");
						v.setDataVenda("25/6/2021");
					}
					if(i == 1) {
						v.setCliente(cl2.getNome());
						v.setVendedor(co4.getID());
						v.setProdutoPedido(ca7.getProdutos());
						v.setQtdProduto(1);
						v.setValor( (ca7.getPrecoProdutos() *v.getQtdProduto() ) );
						v.setFormaDePagamento("Dinheiro");
						v.setDataVenda("3/1/2021");
					}
					if(i == 2) {
						v.setCliente(cl5.getNome());
						v.setVendedor(co2.getID());
						v.setProdutoPedido(ca2.getProdutos());
						v.setQtdProduto(2);
						v.setValor( (ca2.getPrecoProdutos() *v.getQtdProduto()) );
						v.setFormaDePagamento("Cart�o de D�bito");
						v.setDataVenda("2/9/2021");
					}
					if(i == 3) {
						v.setCliente(cl3.getNome());
						v.setVendedor(co3.getID());
						v.setProdutoPedido(ca3.getProdutos());
						v.setQtdProduto(3);
						v.setValor( (ca3.getPrecoProdutos() *v.getQtdProduto() ) );
						v.setFormaDePagamento("Cart�o de Cr�dito");
						v.setDataVenda("5/5/2021");
					}
					if(i == 4) {
						v.setCliente(cl4.getNome());
						v.setVendedor(co5.getID());
						v.setProdutoPedido(ca6.getProdutos());
						v.setQtdProduto(2);
						v.setValor( (ca6.getPrecoProdutos() *v.getQtdProduto()) );
						v.setFormaDePagamento("Pagamento via PIX");
						v.setDataVenda("10/9/2021");
					}
				
					venda.add(v);
				}
		
		for(int i = 0; i < 10; i++) {
			clienteControle[i] = cliente.get(i);
			colaboradorControle[i] = colaborador.get(i);
			pastelControle[i] = pastel.get(i);
			bebidaControle[i] = bebida.get(i);
			cardapioControle[i]= cardapio.get(i);
		}
		
		totalClientes = cliente.size();
		totalColaboradores = colaborador.size();
		totalBebidas = bebida.size();
		totalPasteis = pastel.size();
		totalCardapio = cardapio.size();
		for (int j = 0; j < 5; j++) {
			vendaControle[j] = venda.get(j);
		}
		
		totalVendas = venda.size();
	}

	public Bebida[] getBebidaControle() {
		return bebidaControle;
	}

	public void setBebidaControle(Bebida[] bebidaControle) {
		this.bebidaControle = bebidaControle;
	}

	public int getTotalBebidas() {
		return totalBebidas;
	}

	public void setTotalBebidas(int totalBebidas) {
		this.totalBebidas = totalBebidas;
	}

	public Pastel[] getPastelControle() {
		return pastelControle;
	}

	public void setPastelControle(Pastel[] pastelControle) {
		this.pastelControle = pastelControle;
	}

	public int getTotalPasteis() {
		return totalPasteis;
	}

	public void setTotalPasteis(int totalPasteis) {
		this.totalPasteis = totalPasteis;
	}

	public Cliente[] getClienteControle() {
		return clienteControle;
	}

	public void setClienteControle(Cliente[] clienteControle) {
		this.clienteControle = clienteControle;
	}

	public int getTotalClientes() {
		return totalClientes;
	}

	public void setTotalClientes(int totalClientes) {
		this.totalClientes = totalClientes;
	}

	public Colaborador[] getColaboradorControle() {
		return colaboradorControle;
	}

	public void setColaboradorControle(Colaborador[] colaboradorControle) {
		this.colaboradorControle = colaboradorControle;
	}

	public int getTotalColaboradores() {
		return totalColaboradores;
	}

	public void setTotalColaboradores(int totalColaboradores) {
		this.totalColaboradores = totalColaboradores;
	}

	public Cardapio[] getCardapioControle() {
		return cardapioControle;
	}

	public void setCardapioControle(Cardapio[] cardapioControle) {
		this.cardapioControle = cardapioControle;
	}

	public int getTotalCardapio() {
		return totalCardapio;
	}

	public void setTotalCardapio(int totalCardapio) {
		this.totalCardapio = totalCardapio;
	}

	public Venda[] getVendaControle() {
		return vendaControle;
	}

	public void setVendaControle(Venda[] vendaControle) {
		this.vendaControle = vendaControle;
	}

	public int getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(int totalVendas) {
		this.totalVendas = totalVendas;
	}
}


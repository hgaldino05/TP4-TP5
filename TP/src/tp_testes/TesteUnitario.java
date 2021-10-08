package tp_testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import tp3_tela.*;
class TesteUnitario {

	TelaCardapio t = new TelaCardapio();
	TelaClienteColaborador t2 = new TelaClienteColaborador();
	TelaBebidaPastel t3 = new TelaBebidaPastel();
	
	@Test
	void testTesteCardapio() {
		assertTrue(t.testeCardapio());
	}
	
	@Test
	void testTesteCliente() {
		assertTrue(t2.testeCliente());
	}
	
	@Test
	void testTesteBebida() {
		assertTrue(t3.testeBebidaPastel());
	}

}

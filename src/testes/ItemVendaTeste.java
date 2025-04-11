package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidades.ItemVenda;

class ItemVendaTeste {
	
	ItemVenda itemVenda;

	@BeforeEach
	void setUp() throws Exception {
		int numeroItem = 1;
		String nome = "LEITE";
		int quantidade = 10;
		double precoUnitario = 4.00;
		
		itemVenda = new ItemVenda(numeroItem, nome, quantidade, precoUnitario);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	@Test
	void deveriaCalcularSubTotal() {
		assertEquals(40, itemVenda.subTotal(), 0, "Subtotal 40, 10 unidades para unitario 4");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}

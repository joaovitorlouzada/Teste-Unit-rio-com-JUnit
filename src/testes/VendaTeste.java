package testes;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidades.ItemVenda;
import entidades.Venda;
import enumerados.*;

class VendaTeste {
	
	Venda venda;
	ItemVenda itemVenda;
	TipoPagamento tipoPagamento;
	StatusVenda statusVenda;
	
	@BeforeEach
	void setUp() throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		int numeroVenda = 1;
		Date dataVenda = sdf.parse("11/04/2025");
		statusVenda = StatusVenda.valueOf("INICIANDO");
		tipoPagamento = TipoPagamento.valueOf("DINHEIRO");
		
		int numeroItem = 1;
		String nome = "LEITE";
		int quantidade = 10;
		double precoUnitario = 4.00;
		
		itemVenda = new ItemVenda(numeroItem, nome, quantidade, precoUnitario);
		
		venda = new Venda(numeroVenda, dataVenda, statusVenda, tipoPagamento);
		venda.adicionarItem(itemVenda);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	@Test
	void deveriaCalcularSubTotal() {
		assertEquals(40, itemVenda.subTotal(), 0, "Subtotal 40, 10 unidades para unitario 4");
	}
	@Test
	void deveriaCalcularTotal() {
		assertEquals(40, venda.total(),0, "Total 40 para quant 10 e unitário 4");
	}

	@Test
	void deveriaImprmirCupomFiscal() {
		System.out.println(venda.toString());
	}

}

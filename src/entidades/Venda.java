package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enumerados.StatusVenda;
import enumerados.TipoPagamento;

public class Venda {

	private Integer numero;
	private Date data;
	private StatusVenda statusVenda;
	private TipoPagamento tipoPagamento;

	private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	

	private List<ItemVenda> itens = new ArrayList<>();

	public Venda() {

	}

	public Venda(Integer numero, Date data, StatusVenda statusVenda, 
			TipoPagamento tipoPagamento) {
		this.numero = numero;
		this.data = data;
		this.statusVenda = statusVenda;
		this.tipoPagamento = tipoPagamento;
		this.itens = itens;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numDaVenda) {
		if (numDaVenda < 0)
			System.out.println("Número não pode ser inferior a zero");
		else
			this.numero = numDaVenda;
	}

	public Date getDataDaVenda() {
		return data;
	}

	public void setDataDaVenda(Date dataDaVenda) {
		this.data = dataDaVenda;
	}

	public StatusVenda getStatusVenda() {
		return statusVenda;
	}

	public void setStatusVenda(StatusVenda statusVenda) {
		this.statusVenda = statusVenda;
	}

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public void adicionarItem(ItemVenda item) {
		itens.add(item);
	}

	public void removerItem(ItemVenda item) {
		itens.remove(item);
	}

	public double total() {
		double soma = 0.0;
		for (ItemVenda item : itens) {
			soma += item.subTotal();
		}
		return soma;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append("==================================="+ "\n");
		sb.append("BIG MERCADOS DO BAIRRO LTDA        "+ "\n");
		sb.append("DADOS DA VENDA:                    "+ "\n");
		sb.append("==================================="+ "\n");
		sb.append("Data do pedido: ");
		sb.append(sdf.format(data) + "\n");
		sb.append("Status do pedido: ");
		sb.append(statusVenda + "\n");
		sb.append("Tipo do pagamento: ");
		sb.append(tipoPagamento + "\n");
		sb.append("Local de Entrega: Conforme Info NFE\n");
		sb.append("===================================\n");
		sb.append("ITENS DA VENDA\n");
		sb.append("===================================\n");
		sb.append("");
		// for each		
		for (ItemVenda item : itens) {
			sb.append(item + "\n");
		}		
		sb.append("------------------------------------\n");
		sb.append("Total da Venda..........: R$:");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}

}

package it.polito.PO2020.ricevuta;

public class Item {
	
	private Prodotto prodotto;
	
	public Item(Prodotto prodotto) {
		this.prodotto = prodotto;
	}
	
	public void print() {
		prodotto.print();
	}
	
	public double getPrezzo() {
		return prodotto.getPrezzo();
	}

}

package Klondike;

public class Card {

	Color color;
	Palo palo;
	Valor valor;
	boolean descubierta;
	
	public Card(Color color, Palo palo, Valor valor) {
		this.color = color;
		this.palo = palo;
		this.valor = valor;
		this.descubierta = false;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public Valor getValor() {
		return valor;
	}

	public void setValor(Valor valor) {
		this.valor = valor;
	}

	public void setDiscovered(boolean descubierta) {
		this.descubierta = descubierta;
	}

	public boolean isDiscovered(){
		return descubierta;
	}
}

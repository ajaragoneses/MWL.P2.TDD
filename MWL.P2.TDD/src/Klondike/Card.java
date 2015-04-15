package Klondike;

public class Card {

	private Color color;
	private Palo palo;
	private Valor valor;
	private boolean descubierta;
	
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
	
	@Override
	public String toString(){
		return "["+ color + ","+palo+","+valor+","+descubierta+"]";
	}
}

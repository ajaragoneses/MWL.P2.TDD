package Klondike;

public class Card {

	protected Color color;
	protected Palo palo;
	protected Valor valor;
	protected boolean descubierta;
	
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
	
	public boolean equalPalo(Card card){
		return this.palo == card.getPalo();
	}
	
	@Override
	public String toString(){
		return "["+ color + ","+palo+","+valor+","+descubierta+"]";
	}
}

package Klondike;

public class nullCard extends Card {

	public nullCard(Color color, Palo palo, Valor valor) {
		super(Color.NULO, Palo.NULO, Valor.NULO);
	}

	@Override
	public void setColor(Color color) {}
	
	@Override
	public void setPalo(Palo palo) {}

	@Override
	public void setValor(Valor valor) {}
	
	@Override
	public void setDiscovered(boolean descubierta) {}

	@Override
	public String toString(){
		return "["+ color + ","+palo+","+valor+","+descubierta+"]";
	}
	
}

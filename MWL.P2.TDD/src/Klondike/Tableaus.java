package Klondike;

import java.util.ArrayList;

public class Tableaus {

	private ArrayList<Tableau> internalTableaus;
	
	public Tableaus(){
		internalTableaus = new ArrayList<Tableau>();
		for(int i = 0; i < 7; i++){
			internalTableaus.add(new Tableau());
		}
	}
	
	public int size() {
		return internalTableaus.size();
	}

	public int[] getTableausSizes() {
		int[] retValues = new int[7];
		for(int i = 0; i < 7; i++){
			retValues[i] = internalTableaus.get(i).size();
		}
		return retValues;
	}

	
	public Tableau[] getTableaus(){
		Tableau[] plantilla = new Tableau[internalTableaus.size()];
		for(int i = 0; i < internalTableaus.size(); i++){
			plantilla[i] = internalTableaus.get(i);
		}
		return plantilla;
	}

	public Tableau getTableau(int i) {
		return internalTableaus.get(i);
	}


}

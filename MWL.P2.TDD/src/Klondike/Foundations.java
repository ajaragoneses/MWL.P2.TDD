package Klondike;

import java.util.ArrayList;

public class Foundations {

	private ArrayList<Foundation> internalFoundations;
	
	public Foundations(){
		internalFoundations = new ArrayList<Foundation>();
		for(int i = 0; i < 4; i++){
			internalFoundations.add(new Foundation());
		}
	}
	
	public Foundation get(int i) {
		return internalFoundations.get(i);
	}

	public int size() {
		return internalFoundations.size();
	}

	public int[] getFoundationsSizes() {
		int[] retValues = new int[4];
		for(int i = 0; i < 4; i++){
			retValues[i] = internalFoundations.get(i).size();
		}
		return retValues;
	}

}

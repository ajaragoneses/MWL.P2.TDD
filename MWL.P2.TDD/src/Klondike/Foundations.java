package Klondike;

import java.util.ArrayList;

public class Foundations {

	private ArrayList<Foundation> internalFoundations;
	static final int FOUNDATIONS_SIZE = 4;
	
	
	public Foundations(){
		internalFoundations = new ArrayList<Foundation>();
		for(int i = 0; i < FOUNDATIONS_SIZE; i++){
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
		int[] retValues = new int[FOUNDATIONS_SIZE];
		for(int i = 0; i < FOUNDATIONS_SIZE; i++){
			retValues[i] = internalFoundations.get(i).size();
		}
		return retValues;
	}

}

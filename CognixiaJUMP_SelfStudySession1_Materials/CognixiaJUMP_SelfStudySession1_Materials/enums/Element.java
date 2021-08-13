package com.cognixia.jump.enums;

public enum Element {
	
	// Each value in the enum is passing two values into the constructor
	Nitrogen("N", 7), Oxygen("O", 8), Argon("Ar", 18), Carbon("C", 6);
	
	// These are the data members that the passed in values will be associated with
	public final String symbol;
	public final int atomicNumber;
	
	// Here is the constructor.  It accepts the two values that the elements passed in above and 
	// assigines them to the data members
	private Element(String symbol, int atomicNumber) {
		this.symbol = symbol;
		this.atomicNumber = atomicNumber;
	}

	
	public void describe() {
		System.out.println( name() + " has an atomic symbol of " + symbol 
				+ " and an atomic number of " + atomicNumber );
	}
	

}
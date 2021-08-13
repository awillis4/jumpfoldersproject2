package com.cognixia.jump.innernestedclasses;

public interface Player {

    public int getPoints();
	
	public void addPoints(int pointsToAdd);
	
	public void addToHand(Card card);

	public void showHand();
	
	public void reset();
    
}

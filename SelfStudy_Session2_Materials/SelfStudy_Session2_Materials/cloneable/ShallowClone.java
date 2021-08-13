package com.cognixia.jump.cloneable;

// This class implements Cloneable Marker Interface
// the .clone() method here is written out but does not change
// the implementation inherrited from Object
// The charArray in both Clone Classes in this demo will show the
// difference between shallow copy and deep copy.

public class ShallowClone implements Cloneable{
	
	int number;
	String word;
	CompositionObject object;
	
	ShallowClone(int number, String word, CompositionObject object){
		this.number = number;
		this.word = word;
		this.object = object;
	}
	

	// just using Object.clone() implementation
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	@Override
	public String toString() {
		return "ShallowClone [number=" + number + " word=" + word + "\n  object=" + object + "]";
	}

}


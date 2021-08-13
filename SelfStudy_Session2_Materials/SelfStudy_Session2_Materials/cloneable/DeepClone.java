package com.cognixia.jump.cloneable;

// This Class will walk through @Override the .clone() method
// from Object.  Only objects that implement the Marker Interface
// 'Cloneable' can legally override the .clone() method and use
// it

public class DeepClone implements Cloneable {

	int number;
	String word;
	CompositionObject object;
	
	DeepClone(int number, String word, CompositionObject object){
		this.number = number;
		this.word = word;
		this.object = object;
	}
	
	// Override the .clone() method from Object
	// .clone() requires Marker Interface Cloneable
	@Override
	public Object clone() throws CloneNotSupportedException{
		DeepClone deepClone = (DeepClone)super.clone();
		//Extra clone of all composed objects is necessary
		//to break pass by reference and copy the object
		deepClone.object = (CompositionObject) this.object.clone();
		
		return deepClone;
	}

	@Override
	public String toString() {
		return "DeepClone [number=" + number + ", word=" + word + "\n  object=" + object + "]";
	}
	
}

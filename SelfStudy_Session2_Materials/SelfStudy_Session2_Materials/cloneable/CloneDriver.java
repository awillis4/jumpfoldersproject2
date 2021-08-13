package com.cognixia.jump.cloneable;

public class CloneDriver {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		// Make 2 CompositionObjects, which will be composed. These 
		// will be used to show the difference between shallow and 
		// deep clone
		
		CompositionObject object1 = new CompositionObject("Hello");
		CompositionObject object2 = new CompositionObject("Goodbye");
		
		// Create 2 distinct objects of Shallow and DeepClone
		ShallowClone shallow1 = new ShallowClone(1, "shallow1", object1);
		ShallowClone shallow2 = new ShallowClone(2, "shallow2", object1);
		
		DeepClone deep1 = new DeepClone(3, "Deep1", object2);
		DeepClone deep2 = new DeepClone(4, "Deep2", object2);
		
		// Use deep1 and/or Shallow 1 to show assignment
		// is pass by reference, so changes effect both reference
		// and Shallow1/Deep1
		ShallowClone reference = shallow1;
		
		// Clone Examples of Shallow and Deep
		ShallowClone shallowClone = (ShallowClone)shallow2.clone();
		DeepClone deepClone = (DeepClone)deep2.clone();
		
		// Use this space to call the '.' operator and pull up
		// attributes and reassign them in the original objects
		// then in the section below you can print and see where
		// data was changed and was not
		shallow1.word = "overrode";
		reference.number = 6;
			// Change the referenced Composed objects and see 
			// changes later because shallow copy still references 
			// objects
		shallow2.object.setContents("new shallow");
		deep2.object.setContents("new deep");

		deep2.number = 50;
		deep2.word = "unique";
		
		shallow2.number = 1000;
		shallow2.word = "Very Shallow";
		
		// Space to print outputs of object and their data sets
		// after using reference and shallow/deep cloning
		
			// Print memory references the same location:
			// true or false
		System.out.println("Assignment same memory location check: "
				+ (shallow1 == reference));
			// show that changes to shallow1 effect all
			// objects the just use '='
		System.out.println("\nReference assignment values:\n");
		System.out.println(shallow1 + "\n" + reference);
		
			// show shallow clone with it's original and 
			// the clone
		System.out.println("\nShallow copy same memory location check: "
				+ (shallow2 == shallowClone));
			// print shallow clone and it's original object's values
		System.out.println("\nShallowClone vs original values:\n");
		System.out.println(shallowClone + "\n" + shallow2);
		
		// show deep clone with it's original and 
		// the clone
	System.out.println("\nShallow copy same memory location check: "
			+ (deep2 == deepClone));
		// print deep clone and it's original object's values
	System.out.println("\nDeepClone vs original values:\n");
	System.out.println(deepClone + "\n" + deep2);
	
	// End - add any additional tests for more demonstration
	
	// ** You should notice that the string stored in the composed
	// ** object is changed for both shallow objects because they 
	// ** reference the same thing.  But the deep clone is completely
	// ** independent.

	}

}

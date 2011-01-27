package com.inventwheel.patterns.singleton;

/**
 * Singleton Pattern: the singleton pattern is a design pattern used to
 * implement the mathematical concept of a singleton, by restricting the
 * instantiation of a class to one object.
 * <ul>
 * <li>1. You need to define a private constructor.</li>
 * <li>2. A static method to call create a instance which can be called by other
 * class ({@link Test} )
 * <li>
 * </ul>
 * 
 * @author sansor
 * 
 */
public class Singleton {

	private static Singleton singleton;
	
	public static Singleton getSingleton() {
		if (singleton == null) {
			return new Singleton();
		}
		return singleton;
	}

	private Singleton() {

	}

	public void callthis() {
		System.out.println("in Call this method");
	}
}

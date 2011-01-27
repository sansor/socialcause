package com.inventwheel.patterns.singleton;

public class Test {

	public static void main(String args[]){
		Singleton singleton = Singleton.getSingleton();
		singleton.callthis();
	}
}

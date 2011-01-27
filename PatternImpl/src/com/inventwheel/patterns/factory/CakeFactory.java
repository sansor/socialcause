package com.inventwheel.patterns.factory;

public class CakeFactory {

	public static String CHOCOLATE_CAKE ="chocolate";
	public static String FRUIT_CAKE ="fruit";
	
	public static Cake prepareCake(String cakeType){
		if(cakeType.equalsIgnoreCase(CHOCOLATE_CAKE)){
			return new ChocolateCake();
		}else{
			return new FruitCake();
		}
	}
}

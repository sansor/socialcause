/**
 * 
 */
package com.inventwheel.patterns.factory;

/**
 * @author sansor
 *
 */
public class PizzaFactory {

	public static final String INDIAN_PIZZA ="Indian";
	public static final String AMERICAN_PIZZA ="America";
	public static final String ITALINA_PIZZA ="Italian";
	
	public static Pizza createPizza(String pizzaType){
		if(pizzaType.equalsIgnoreCase(INDIAN_PIZZA)){
			return new IndianPizza();
		}else if(pizzaType.equalsIgnoreCase(ITALINA_PIZZA)){
			return new ItalianPizza();
		}else {
			return new AmericanPizza();
		}
	}
}

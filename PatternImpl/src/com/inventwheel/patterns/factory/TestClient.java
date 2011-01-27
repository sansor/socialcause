/**
 * 
 */
package com.inventwheel.patterns.factory;

/**
 * @author sansor
 *
 */
public class TestClient {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//By Extending classes
		Pizza pizza = PizzaFactory.createPizza(PizzaFactory.AMERICAN_PIZZA);
		System.out.println(pizza.topings());
		
		//By implementing interfaces
		Cake cake = CakeFactory.prepareCake(CakeFactory.CHOCOLATE_CAKE);
		System.out.println(cake.getCakeTopings());
	}

}

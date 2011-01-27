/**
 * 
 */
package com.inventwheel.patterns.builder;

/**
 * @author sansor
 *
 */
public class ChickenBurger implements Burger {

	@Override
	public Double getPrice() {
		return 10.00;
	}

	@Override
	public String makeBurger() {
		return "making chiken burger";
	}

}

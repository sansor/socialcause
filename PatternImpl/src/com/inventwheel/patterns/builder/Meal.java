package com.inventwheel.patterns.builder;

public class Meal {

	private Burger burger;
	private ColdDrink coldDrink;
	private Fries fries;

	public Fries getFries() {
		return fries;
	}

	public void setFries(Fries fries) {
		this.fries = fries;
	}

	public ColdDrink getColdDrink() {
		return coldDrink;
	}

	public void setColdDrink(ColdDrink coldDrink) {
		this.coldDrink = coldDrink;
	}

	public Burger getBurger() {
		return burger;
	}

	public void setBurger(Burger burger) {
		this.burger = burger;
	}

	public Double getPrice(Meal meal){
		return meal.getBurger().getPrice()+meal.getColdDrink().getPrice()+meal.getFries().getPrice();
	}
	
	public String prepare(){
		return burger.makeBurger() + "\n" + fries.makeFries() + "\n" + coldDrink.serveColdDrink()+"\n";  
	}
}

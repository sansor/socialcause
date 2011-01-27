package com.inventwheel.patterns.builder;

/**
 * This class will build the complex object Meal and get the price for the same
 * @author sansor
 *
 */
public class MealBuilder {

	public static String BURGER_VEGGIE="veggie";
	public static String BURGER_CHICKEN="chicken";
	
	public static String FRIES_MAC="mac";
	public static String FRIES_DAC="dac";
	
	public static String COLD_COKE="Coke";
	public static String COLD_PEPSI="Pepse";
	
	public static Meal getMeal(String burgerType, String friesType, String drinkType){
		Meal meal = new Meal();
		if(burgerType.equalsIgnoreCase(BURGER_VEGGIE)){
			meal.setBurger(new VeggieBurger());
		}else {
			meal.setBurger(new ChickenBurger());
		}
		
		if(drinkType.equalsIgnoreCase(COLD_COKE)){
			meal.setColdDrink(new Coke());
		}else {
			meal.setColdDrink(new Pepsi());
		}
		
		if(friesType.equalsIgnoreCase(FRIES_MAC)){
			meal.setFries(new MacFries());
		}else {
			meal.setFries(new DacFries());
		}
		System.out.println(meal.prepare());
		return meal;
	}
}

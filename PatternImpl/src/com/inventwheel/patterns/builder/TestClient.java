package com.inventwheel.patterns.builder;

public class TestClient {

	public static void main(String args[]){
		Meal meal = MealBuilder.getMeal(MealBuilder.BURGER_VEGGIE, MealBuilder.FRIES_DAC, MealBuilder.COLD_PEPSI);
		System.out.println(meal.getPrice(meal));
	}
}


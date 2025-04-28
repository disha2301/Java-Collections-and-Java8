package com.gevernova.generics.mealplangenerator;

class VegetarianMeal implements MealPlan {
    @Override
    public void displayMealPlan() {
        System.out.println("This is a Vegetarian meal plan with plant-based foods.");
    }
}
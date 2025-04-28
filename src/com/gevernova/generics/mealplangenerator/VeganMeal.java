package com.gevernova.generics.mealplangenerator;

class VeganMeal implements MealPlan {
    @Override
    public void displayMealPlan(){
        System.out.println("This is a Vegan meal plan with no animal products.");
    }
}

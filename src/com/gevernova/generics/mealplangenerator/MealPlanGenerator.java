package com.gevernova.generics.mealplangenerator;
// Step 4: Testing the Meal Plan Generator
public class MealPlanGenerator {
    public static void main(String[] args){
        // create different meal plan objects
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veg = new Meal<>(new VeganMeal());
        Meal<KetoMeal> keto = new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> high = new Meal<>(new HighProteinMeal());

        // Step 5: Generate personalized meal plans using the generic method
        System.out.println("Generating Personalized Meal Plans:");

        Meal.generateMealPlan(vegMeal.getMealPlan());  // Call the generic method to display the plan
        Meal.generateMealPlan(veg.getMealPlan());
        Meal.generateMealPlan(keto.getMealPlan());
        Meal.generateMealPlan(high.getMealPlan());
    }
}

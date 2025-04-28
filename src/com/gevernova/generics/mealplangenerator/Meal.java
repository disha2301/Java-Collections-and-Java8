package com.gevernova.generics.mealplangenerator;
// Step 2: Create the generic Meal class
class Meal<T extends MealPlan>{
    private T mealPlan;

    // constructor
    public Meal(T mealPlan){
        this.mealPlan = mealPlan;
    }

    // Step 3: Generic method to validate and generate a personalized meal plan
    public static <T extends MealPlan> void generateMealPlan(T mealPlan){
        if(mealPlan != null){
            mealPlan.displayMealPlan();
        }
        else{
            System.out.println("Invalid meal plan");
        }
    }
    // getter
    public T getMealPlan(){
        return mealPlan;
    }
}

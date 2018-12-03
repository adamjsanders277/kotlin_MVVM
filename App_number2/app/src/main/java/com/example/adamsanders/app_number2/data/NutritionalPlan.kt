package com.example.adamsanders.app_number2.data

import android.databinding.ObservableInt

data class NutritionalPlan (var foods: MutableList<Food> = mutableListOf(),
                            val totalCalories: ObservableInt = ObservableInt() ) {

    fun addFood(food: Food) {
        foods.add(food)
        totalCalories.set(totalCalories.get() + food.calories)
    }
}
package com.example.adamsanders.app_number2.ui.nutritionalPlan

import com.example.adamsanders.app_number2.data.Food
import com.example.adamsanders.app_number2.data.NutritionalPlan
import java.util.*

class NutritionalPlanViewModel (val nutitionalPlan: NutritionalPlan = NutritionalPlan()) : Observable() {

    fun addFood(name: String, calories: Int) {
        val food = Food(name, calories)
        nutitionalPlan.addFood(food)
        setChanged()
        notifyObservers()
    }

    fun showAddFoodDialog() {
        setChanged()
        notifyObservers(SHOW_ADD_FOOD_DIALOG)
    }

    companion object {
        const val SHOW_ADD_FOOD_DIALOG = "show add food dialog"
    }
}
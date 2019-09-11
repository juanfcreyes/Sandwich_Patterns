package udemy.android.sandwinchbuilderpattern.builder

import udemy.android.sandwinchbuilderpattern.ingredient.Ingredient

class SandwichBuilder {

    fun build(sandwich: Sandwich, ingredient: Ingredient) {
        sandwich.addIngredient(ingredient)
    }

    fun replaceBreadStatus(sandwich: Sandwich, ingredient: Ingredient) {
        sandwich.replaceBreadStatus(ingredient)
    }
}
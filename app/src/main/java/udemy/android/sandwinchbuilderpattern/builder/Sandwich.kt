package udemy.android.sandwinchbuilderpattern.builder

import udemy.android.sandwinchbuilderpattern.ingredient.Ingredient

class Sandwich {
    private var ingredients: ArrayList<Ingredient> = ArrayList()

    fun addIngredient(ingredient: Ingredient) {
        this.ingredients.add(ingredient)
    }

    fun getBread() : Ingredient = this.ingredients.get(0)

    fun replaceBreadStatus(ingredient: Ingredient) {
        this.ingredients.removeAt(0)
        this.addIngredient(ingredient)
    }

    fun getKcal(): Int {
        return this.ingredients.map { ingredient -> ingredient.kcla() }
            .reduce { acc, kcal -> acc + kcal }
    }

    fun getSandwich(): String {
        return this.ingredients.map { ingredient -> ingredient.description() }
            .reduce { acc, description -> "$acc $description" }
    }

}
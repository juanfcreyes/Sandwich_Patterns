package udemy.android.sandwinchbuilderpattern.ingredient.bread

import udemy.android.sandwinchbuilderpattern.ingredient.Ingredient

abstract class Bread : Ingredient {
    open lateinit var decoration: String
    open var decorationKcal: Int = 0
}
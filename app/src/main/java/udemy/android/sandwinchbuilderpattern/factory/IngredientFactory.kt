package udemy.android.sandwinchbuilderpattern.factory

import udemy.android.sandwinchbuilderpattern.R
import udemy.android.sandwinchbuilderpattern.ingredient.Ingredient
import udemy.android.sandwinchbuilderpattern.ingredient.bread.Bagel
import udemy.android.sandwinchbuilderpattern.ingredient.bread.Bagette
import udemy.android.sandwinchbuilderpattern.ingredient.filling.Cheese
import udemy.android.sandwinchbuilderpattern.ingredient.filling.Ham
import udemy.android.sandwinchbuilderpattern.ingredient.others.Salt

class IngredientFactory {

    companion object {
        private val ingredients : HashMap<Int, Ingredient> = HashMap()
        init {
            ingredients.put(R.id.radio_bagel, Bagel())
            ingredients.put(R.id.radio_baguette, Bagette())
            ingredients.put(R.id.check_cheese, Cheese())
            ingredients.put(R.id.check_ham, Ham())
            ingredients.put(R.id.switch_salt, Salt())
        }
        fun getIngredient(id: Int) : Ingredient? = ingredients[id]
    }
}
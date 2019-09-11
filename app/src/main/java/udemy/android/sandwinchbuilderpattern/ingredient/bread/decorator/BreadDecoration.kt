package udemy.android.sandwinchbuilderpattern.ingredient.bread.decorator

import udemy.android.sandwinchbuilderpattern.ingredient.bread.Bread

abstract class BreadDecoration() : Bread() {
    abstract override var decoration: String
    abstract override var decorationKcal: Int
}
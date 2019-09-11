package udemy.android.sandwinchbuilderpattern.ingredient.bread.decorator

import udemy.android.sandwinchbuilderpattern.ingredient.bread.Bread

class Toasted(var bread: Bread) : BreadDecoration(){

    override var decoration: String = bread.description() + " Tostada"

    override var decorationKcal: Int = bread.kcla() + 0

    override fun description(): String  = decoration

    override fun kcla(): Int = decorationKcal

}
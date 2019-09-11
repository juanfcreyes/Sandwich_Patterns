package udemy.android.sandwinchbuilderpattern.ingredient.bread

class Bagel() : Bread() {

    var description: String = "Rosquilla"
    var kcal: Int = 280

    override fun description(): String = description
    override fun kcla(): Int = kcal
}
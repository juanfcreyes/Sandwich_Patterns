package udemy.android.sandwinchbuilderpattern.ingredient.bread

class Bagette() : Bread() {

    var description: String = "Barra de pan"
    var kcal: Int = 160

    override fun description(): String = description
    override fun kcla(): Int = kcal
}
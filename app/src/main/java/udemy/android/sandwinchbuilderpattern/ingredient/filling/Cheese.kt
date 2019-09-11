package udemy.android.sandwinchbuilderpattern.ingredient.filling

class Cheese : Filling() {

    var description: String = "Queso"
    var kcal: Int = 80

    override fun description(): String = description
    override fun kcla(): Int = kcal
}
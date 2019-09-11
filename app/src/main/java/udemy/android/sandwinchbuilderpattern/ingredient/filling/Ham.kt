package udemy.android.sandwinchbuilderpattern.ingredient.filling


class Ham(): Filling() {
    var description: String = "Jamón"
    var kcal: Int = 64

    override fun description(): String = description
    override fun kcla(): Int = kcal
}
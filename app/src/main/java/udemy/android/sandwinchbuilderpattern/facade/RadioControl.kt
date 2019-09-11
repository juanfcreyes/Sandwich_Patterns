package udemy.android.sandwinchbuilderpattern.facade

import android.view.View
import android.widget.RadioButton
import udemy.android.sandwinchbuilderpattern.builder.Sandwich
import udemy.android.sandwinchbuilderpattern.builder.SandwichBuilder
import udemy.android.sandwinchbuilderpattern.factory.IngredientFactory

class RadioControl : Control {

    override fun getOutput(sandwich: Sandwich, builder: SandwichBuilder, widgets: List<View>) {
        val selectView = widgets.filter { radio -> (radio as RadioButton).isChecked }.first()
        builder.build(sandwich, IngredientFactory.getIngredient(selectView.id)!!)
    }
}
package udemy.android.sandwinchbuilderpattern.facade

import android.view.View
import android.widget.RadioButton
import android.widget.Switch
import udemy.android.sandwinchbuilderpattern.builder.Sandwich
import udemy.android.sandwinchbuilderpattern.builder.SandwichBuilder
import udemy.android.sandwinchbuilderpattern.factory.IngredientFactory
import udemy.android.sandwinchbuilderpattern.ingredient.Ingredient

class SwitchControl  : Control {
    override fun getOutput(sandwich: Sandwich, builder: SandwichBuilder, widgets: List<View>) {
        val selectView = widgets.filter { switch -> (switch as Switch).isChecked }
        for (switch in selectView) {
            val ingredient: Ingredient? = IngredientFactory.getIngredient(switch.id)
            if (ingredient != null) {
                builder.build(sandwich, ingredient)
            }
        }
    }
}
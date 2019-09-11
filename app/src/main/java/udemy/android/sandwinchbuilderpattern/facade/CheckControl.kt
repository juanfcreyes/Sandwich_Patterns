package udemy.android.sandwinchbuilderpattern.facade

import android.view.View
import android.widget.CheckBox
import udemy.android.sandwinchbuilderpattern.builder.Sandwich
import udemy.android.sandwinchbuilderpattern.builder.SandwichBuilder
import udemy.android.sandwinchbuilderpattern.factory.IngredientFactory

class CheckControl : Control {

    override fun getOutput(sandwich: Sandwich, builder: SandwichBuilder, widgets: List<View>) {
        val selectsView = widgets.filter { checkbox -> (checkbox as CheckBox).isChecked } as List<CheckBox>
        for ( view in selectsView ) {
            builder.build(sandwich, IngredientFactory.getIngredient(view.id)!!)
        }
    }

}
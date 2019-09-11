package udemy.android.sandwinchbuilderpattern.facade

import android.view.View
import udemy.android.sandwinchbuilderpattern.builder.Sandwich
import udemy.android.sandwinchbuilderpattern.builder.SandwichBuilder

interface Control {
    fun getOutput(sandwich: Sandwich ,builder: SandwichBuilder, widgets: List<View>)
}
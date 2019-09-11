package udemy.android.sandwinchbuilderpattern.facade

import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Switch
import udemy.android.sandwinchbuilderpattern.R
import udemy.android.sandwinchbuilderpattern.builder.Sandwich
import udemy.android.sandwinchbuilderpattern.builder.SandwichBuilder
import udemy.android.sandwinchbuilderpattern.ingredient.bread.Bread
import udemy.android.sandwinchbuilderpattern.ingredient.bread.decorator.Toasted

class FacadeSandwich(var radios: ArrayList<RadioButton>, var checks: ArrayList<CheckBox>, var switchs: ArrayList<Switch>) {

    private var sandwich: Sandwich = Sandwich()
    private var radioControl: RadioControl = RadioControl()
    private var switchControl: SwitchControl = SwitchControl()
    private var checkControl: CheckControl = CheckControl()

    fun getSandwichBuild() : Sandwich {
        val builder = SandwichBuilder()
        radioControl.getOutput(sandwich, builder, radios)

        val toasted = switchs.find { view -> view.id == R.id.switch_toasted }
        if (toasted!!.isChecked) {
            sandwich.replaceBreadStatus(Toasted(sandwich.getBread() as Bread))
        }

        checkControl.getOutput(sandwich, builder, checks)
        switchControl.getOutput(sandwich, builder, switchs)
        return sandwich
    }

}
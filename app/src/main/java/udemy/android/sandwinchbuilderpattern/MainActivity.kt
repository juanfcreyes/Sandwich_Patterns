package udemy.android.sandwinchbuilderpattern

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import udemy.android.sandwinchbuilderpattern.ingredient.bread.Bagel
import udemy.android.sandwinchbuilderpattern.ingredient.bread.Bagette
import udemy.android.sandwinchbuilderpattern.builder.Sandwich
import udemy.android.sandwinchbuilderpattern.builder.SandwichBuilder
import udemy.android.sandwinchbuilderpattern.facade.FacadeSandwich
import udemy.android.sandwinchbuilderpattern.ingredient.bread.Bread
import udemy.android.sandwinchbuilderpattern.ingredient.bread.decorator.Toasted
import udemy.android.sandwinchbuilderpattern.ingredient.filling.Cheese
import udemy.android.sandwinchbuilderpattern.ingredient.filling.Ham
import udemy.android.sandwinchbuilderpattern.ingredient.others.Salt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun actionOKClicked(view: View) {

        val radios : ArrayList<RadioButton> = ArrayList()
        radios.add(radio_bagel)
        radios.add(radio_baguette)

        val checks : ArrayList<CheckBox> = ArrayList()
        checks.add(check_cheese)
        checks.add(check_ham)

        val switches : ArrayList<Switch> = ArrayList()
        switches.add(switch_toasted)
        switches.add(switch_salt)

        val facade = FacadeSandwich(radios, checks, switches)

        text_view_order.text = facade.getSandwichBuild().getSandwich()
        total_kcal.text = getString(R.string.total_kcal, facade.getSandwichBuild().getKcal())
    }

    fun actionCancelClicked(view: View) {
        Toast.makeText(this,  "Peticion cancelada", Toast.LENGTH_LONG).show()
    }
}

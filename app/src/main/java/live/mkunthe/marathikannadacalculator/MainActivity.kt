package live.mkunthe.marathikannadacalculator

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    lateinit var calcET: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calcET = findViewById(R.id.calcET)

        calcET.setText("fasfadsfad")

        //To hide user input bcz im only giving number pad
        calcET.setOnClickListener {
           // Toast.makeText(this, "ksdjnbckjznc", Toast.LENGTH_LONG).show()
            // This code is taken from ->  https://stackoverflow.com/a/45857155/15334005
            val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(it.windowToken, 0)
        }


    }
}

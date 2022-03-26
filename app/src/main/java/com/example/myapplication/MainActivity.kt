import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    lateinit var spinner: Spinner
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.calc)

        val edtxt1: EditText = findViewById(R.id.num1)

        val edtxt2: EditText = findViewById(R.id.num2)

        val resultTV: TextView = findViewById(R.id.res)
        button.setOnClickListener{ view ->

            var x: Int = edtxt1.text.toString().toInt();

            var y: Int = edtxt2.text.toString().toInt()

            resultTV.text = sum(x,y).toString();

        }
        textView = findViewById(R.id.textView)
        spinner = findViewById(R.id.spinner)
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.birds,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = this
    }
    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val text: String = parent?.getItemAtPosition(position).toString()
        textView.text = text
    }
}
public fun sum(a: Int, b: Int): Int {

    return a+b;

}
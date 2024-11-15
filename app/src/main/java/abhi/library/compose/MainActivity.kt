package abhi.library.compose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import abhi.library.compose.databinding.ActivityMainBinding
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Toast.makeText(this@MainActivity,"The click is woring ${anotherStringReturn()}",Toast.LENGTH_SHORT).show()
        // Example of a call to a native method
        binding.sampleText.text = stringFromJNI()
        binding.sampleTextTwo.text = anotherStringReturn()
    }

    /**
     * A native method that is implemented by the 'compose' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String
    external fun anotherStringReturn():String
    companion object {
        // Used to load the 'compose' library on application startup.
        init {
            System.loadLibrary("compose")
        }
    }
}
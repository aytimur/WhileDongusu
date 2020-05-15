package ibrahim.aytimur.whiledongusu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // while, do - while döngüleri
        // while
        var i = 0
        var toplam = 0
        while (i<7){
            toplam += i
            i++
            textView.setText("$toplam")
        }

        // do -while
        var a = 7
        do {
            textView.setText("$a")
            a++
        }
            while (a<6)
    }
}

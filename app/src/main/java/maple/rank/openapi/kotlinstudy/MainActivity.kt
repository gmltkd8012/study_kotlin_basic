package maple.rank.openapi.kotlinstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val coins: (Int) -> String = {
            "$it quarters"
        }

        val cupcake: (Int) -> String = {
            "Have a cupcake!"
        }

        val treatFunction = trickOrTreat(false) {"$it quarters"}
        val trickFunction = trickOrTreat(true, null)

//        treatFunction()
//        trickFunction()

        repeat(4) {
         treatFunction()
        }
        trickFunction()

        //Log.e("heesang", "${trickFunction()} ::: ${trick()}" )
    }

    fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
        if (isTrick) {
            return trick
        } else {
            if (extraTreat != null) {
                Log.d("heesang", "${extraTreat(5)}")
            }
            return  treat
        }
    }

    val trick: () -> Unit = {
        Log.i("heesang", "No treats!!!")
    }

    val treat: () -> Unit = {
        Log.i("heesang", "Have a treat!!!")
    }
}
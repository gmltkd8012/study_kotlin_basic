package maple.rank.openapi.kotlinstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val morningNotification = 51
        val eveningNotification = 135

        printNotificationSummary(morningNotification)
        printNotificationSummary(eveningNotification)

    }

    fun printNotificationSummary(numberOfMessage: Int) {
        numberOfMessage.let {
            if (it > 99) Log.e("heesang", "Your phone is blowing up! You have 99+ notifications.")
            else Log.d("heesang", "You have ${it} notifications.")
        }
    }


}
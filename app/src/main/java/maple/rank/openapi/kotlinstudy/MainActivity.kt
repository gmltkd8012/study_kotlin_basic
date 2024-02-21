package maple.rank.openapi.kotlinstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Interface 호출
        Quiz().printProgressBar()
        // 확장 함수 호출
        Quiz.printProgressBar()



        Quiz().printQuiz()
    }




    /* 확장 함수 */
    fun Quiz.StudentProgress.printProgressBar() {
        var progressBar = ""
        repeat(Quiz.answered) {
           progressBar += "▓"
        }
        repeat(Quiz.total - Quiz.answered) {
            progressBar += "▒"
        }
        Log.i("heesang", progressBar)
    }


    /* 확장 함수 */
//    val Quiz.StudentProgress.progressText: String
//        get() = "${Quiz.answered} of ${Quiz.total} answered"


}
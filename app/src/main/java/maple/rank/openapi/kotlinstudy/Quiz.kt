package maple.rank.openapi.kotlinstudy

import android.util.Log

class Quiz : ProgressPrintable {

    val question1 = Question<String>("질문", "답변", Difficulty.EASY)
    val question2 = Question<Int>("질문", 123, Difficulty.HARD)

    override val progressText: String
        get() = ""

    override fun printProgressBar() {
        var progressBar = ""
        repeat(Quiz.answered) {
            progressBar += "▓"
        }
        repeat(Quiz.total - Quiz.answered) {
            progressBar += "▒"
        }
        Log.i("heesang", progressBar)
    }

    fun printQuiz() {
        question1.let {
            Log.d("heesang", "question1: ${it.questionText}")
            Log.d("heesang", "question1: ${it.answer}")
            Log.d("heesang", "question1: ${it.difficulty}")
        }

        question2.let {
            Log.i("heesang", "question2: ${it.questionText}")
            Log.i("heesang", "question2: ${it.answer}")
            Log.i("heesang", "question2: ${it.difficulty}")
        }
    }

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }
}
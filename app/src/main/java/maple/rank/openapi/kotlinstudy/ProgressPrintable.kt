package maple.rank.openapi.kotlinstudy

import android.util.Log

interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}
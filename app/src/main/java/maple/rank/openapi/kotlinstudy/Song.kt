package maple.rank.openapi.kotlinstudy

import android.util.Log

/* 문제 4: 노래 카탈로그 */
class Song (
    val title: String,
    val artist: String,
    val year: String,
    val playCount: Int) {


    val popular: Boolean
        get() = playCount >= 1000

    fun info() {
        Log.d("heesang", "[${title}], 연주한 [${artist}], 출시한 [${year}]")
    }


    /**
     *  해당 코드 보다는 get() 코드를 사용하자
     */
//    fun popular() : Boolean {
//        return 1000 <= playCount
//    }

}
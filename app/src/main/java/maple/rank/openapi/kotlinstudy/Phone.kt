package maple.rank.openapi.kotlinstudy

import android.util.Log

/* 문제 6: 폴더블 스마트폰 */
open class Phone (
    var isScreenLightOn: Boolean = false
) {

    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        Log.d("heesang", "The phone screen's light is $phoneScreenLight.")
    }
}
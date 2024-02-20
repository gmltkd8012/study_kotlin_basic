package maple.rank.openapi.kotlinstudy

import android.util.Log


/* 문제 5: 인터넷 프로필 */

class Person (
    val name: String,
    val age: Int,
    val hobby: String?,
    val referrer: Person?)
{

    fun showProfile() {
        Log.d("heesang", "Name: ${name}")
        Log.d("heesang", "Age: ${age}")

        var str: String = "Doesn't have a hobby"
        if (hobby != null) {
            str = "Likes to play ${hobby}"
        }

        var person: String = "Doesn't have a referrer."
        if (referrer != null) {
            person = "Has a referrer named ${referrer.name}, who likes to play ${referrer.hobby}"
        }

        Log.d("heesang", "${str}. ${person}")
    }
}
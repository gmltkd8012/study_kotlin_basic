package maple.rank.openapi.kotlinstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
//        val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
//
//        val solarSystem = rockPlanets + gasPlanets
//
//        solarSystem[3] = "하하하"
//        for (index in solarSystem) {
//            Log.d("heesang", "${index}")
//        }

//        val solarList = mutableListOf("가", "나", "다", "라", "마", "바", "사")
//        val solarSet = mutableSetOf("가", "나", "다", "라", "마", "바", "사")
//        val solarMap = mutableMapOf(
//            "가" to 1,
//            "나" to 13,
//            "다" to 12,
//            "라" to 30,
//            "마" to 31,
//            "바" to 28,
//            "사" to 44
//        )
//
//
//        solarMap["가"] = 12
//
//        Log.d("heesang", "List ::: ${solarList.get(3)}")
//        Log.i("heesang", "Set ::: ${solarSet}")
//        Log.e("heesang", "Map ::: ${solarMap["가"]}")

//        cookies.forEach {
//            Log.d("heesang", "Menu item: ${it.name}")
//        }
//
//        fullMenu.forEach {
//            Log.i("heesang", it)
//        }
//
//        softBakedMenu.forEach {
//            Log.e("heesang", "${it.name} - $${it.price}")
//        }
//
//        softMenu.forEach {
//            Log.d("heesang","${it.name} - $${it.price}")
//        }
//        crunchyMenu.forEach {
//            Log.d("heesang","${it.name} - $${it.price}")
//        }
//        Log.e("heesang","$1.4 up menu" )
//        menuPrice.first.forEach {
//            Log.i("heesang","${it.name} - $${it.price}" )
//        }
//        Log.e("heesang","$1.4 down menu" )
//        menuPrice.second.forEach {
//            Log.i("heesang","${it.name} - $${it.price}" )
//        }
//
//        Log.d("heesang", "Total price: $${totalPrice}")
//
//        Log.e("heesang","Sorted Price" )
//        sortedMenu.forEach {
//            Log.e("heesang","${it.name} - $${it.price}" )
//        }
//
//        Log.d("heesang","Sorted Price" )
//        sortedReverseMenu.forEach {
//            Log.d("heesang","${it.name} - $${it.price}" )
//        }

        val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Event.Daypart.MORNING, durationInMinutes = 0)
        val event2 = Event(title = "Eat breakfast", daypart = Event.Daypart.MORNING, durationInMinutes = 15)
        val event3 = Event(title = "Learn about Kotlin", daypart = Event.Daypart.AFTERNOON, durationInMinutes = 30)
        val event4 = Event(title = "Practice Compose", daypart = Event.Daypart.AFTERNOON, durationInMinutes = 60)
        val event5 = Event(title = "Watch latest DevBytes video", daypart = Event.Daypart.AFTERNOON, durationInMinutes = 10)
        val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Event.Daypart.EVENING, durationInMinutes = 45)


        val eventList = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)


        val underHourEvent = eventList.filter {
            it.durationInMinutes < 60
        }

//        val underHourList = underHourEvent.first

//        underHourEvent.forEach {
//            Log.d("heesang","${it.title}" )
//        }

        val groupDaypart = eventList.groupBy {
            it.daypart
        }

        groupDaypart.forEach { (daypart, events) ->

           // Log.d("heesang","${daypart}: ${events.size} events")
//            when (it.key) {
//                Event.Daypart.MORNING -> {
//                    Log.d("heesang","${Event.Daypart.MORNING}: ${it.value.size} events")
//                }
//                Event.Daypart.AFTERNOON -> {
//                    Log.d("heesang","${Event.Daypart.AFTERNOON}: ${it.value.size} events")
//                }
//                Event.Daypart.EVENING -> {
//                    Log.d("heesang","${Event.Daypart.EVENING}: ${it.value.size} events")
//                }
//                else -> {}
//            }
        }

       // Log.i("heesang","마지막 이벤트 타이틀: ${eventList.last().title}")

        event1.durationOfEvent


    }

    val Event.durationOfEvent: String
        get() = if (this.durationInMinutes < 60) {
            "short"
        } else {
            "long"
        }


    val cookies = listOf(
        Cookie(
            name = "Chocolate Chip",
            softBaked = false,
            hasFilling = false,
            price = 1.69
        ),
        Cookie(
            name = "Banana Walnut",
            softBaked = true,
            hasFilling = false,
            price = 1.49
        ),
        Cookie(
            name = "Vanilla Creme",
            softBaked = false,
            hasFilling = true,
            price = 1.59
        ),
        Cookie(
            name = "Chocolate Peanut Butter",
            softBaked = false,
            hasFilling = true,
            price = 1.49
        ),
        Cookie(
            name = "Snickerdoodle",
            softBaked = true,
            hasFilling = false,
            price = 1.39
        ),
        Cookie(
            name = "Blueberry Tart",
            softBaked = true,
            hasFilling = true,
            price = 1.79
        ),
        Cookie(
            name = "Sugar and Sprinkles",
            softBaked = false,
            hasFilling = false,
            price = 1.39
        )
    )

    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }

    val softBakedMenu = cookies.filter {
        it.softBaked
    }

    val groupedMenu = cookies.groupBy {
        it.softBaked
    }

    val softMenu = groupedMenu[true] ?: emptyList()
    val crunchyMenu = groupedMenu[false] ?: listOf()

    val menuPrice = cookies.partition {
        it.price > 1.4
    }

    val totalPrice = cookies.fold(0.0) { total, cookie ->
        total + cookie.price
    }

    val sortedMenu = cookies.sortedBy {
        it.price
    }

    val sortedReverseMenu = cookies.sortedByDescending {
        it.price
    }

}
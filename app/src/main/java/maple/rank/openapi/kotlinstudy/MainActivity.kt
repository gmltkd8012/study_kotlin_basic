package maple.rank.openapi.kotlinstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /* 문제 1: 모바일 열림 */
//        val morningNotification = 51
//        val eveningNotification = 135
//
//        printNotificationSummary(morningNotification)
//        printNotificationSummary(eveningNotification)

        /* 문제 2: 영화 티켓 가격 */
//        val child = 5
//        val adult = 28
//        val senior = 87
//
//        val isMonday = true
//
//
//        Log.d("heesang", "The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
//        Log.d("heesang", "The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
//        Log.d("heesang", "The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")


        /* 문제 3: 온도 변환기 */
//        val celsius = printFinalTemperature(27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }
//        val kelvin = printFinalTemperature(350.0, "Kelvin", "Celsius") { it - 273.15 }
//        val fahrenheit = printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }

        /* 문제 4: 노래 카탈로그 */
//        val song = Song("질풍가도", "몰러", "1997", 1202).apply {
//            Log.i("heesang", "Song ~ ::: " +  popular)
//            info()
//
//        }
//        val song1 = Song("우리의꿈", "코요테", "2001", 887).apply {
//            Log.i("heesang", "Song1 ~ ::: " +  popular )
//            info()
//        }

        /* 문제 5: 인터넷 프로필 */
//        val amanda = Person("Amanda", 33, "play tennis", null)
//        val atiqah = Person("Atiqah", 28, null, amanda)
//
//        amanda.showProfile()
//        atiqah.showProfile()

        /* 문제 6: 폴더블 스마트폰 */
//        val foldablePhone = FoldablePhone().apply {
//            isFold = true
//            switchOn()
//            checkPhoneScreenLight()
//        }

        /* 문제 7: 특별 경매 */
        val winningBid = Bid(1000, "Private Collector")

        Log.d("heesang","Item A is sold at ${auctionPrice(winningBid, 2000)}.")
        Log.d("heesang","Item B is sold at ${auctionPrice(null, 3000)}.")
    }

    /* 문제 1: 모바일 열림 */
//    fun printNotificationSummary(numberOfMessage: Int) {
//        numberOfMessage.let {
//            if (it > 99) Log.e("heesang", "Your phone is blowing up! You have 99+ notifications.")
//            else Log.d("heesang", "You have ${it} notifications.")
//        }
//    }

    /* 문제 2: 영화 티켓 가격 */
//    fun ticketPrice(age: Int, isMonday: Boolean): Int {
//        return when(age) {
//            in 0..12 -> 15
//            in 13..60 -> if (isMonday) 25 else 30
//            in 61..100 -> 20
//            else -> -1
//        }
//    }

    /* 문제 3: 온도 변환기 */
//    fun printFinalTemperature(
//        initialMeasurement: Double,
//        initialUnit: String,
//        finalUnit: String,
//        conversionFormula: (Double) -> Double
//    ) {
//        val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
//        Log.d("heesang", "$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
//    }


    /* 문제 7: 특별 경매 */
    /**
     *  안전 호출 연산자 (?.) 와 (?:) 사용하여 정확한 가격을 반환
     */
    fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
        return bid?.amount ?: minimumPrice
    }




}
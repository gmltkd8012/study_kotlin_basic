package maple.rank.openapi.kotlinstudy

class Event (
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int
) {



    enum class Daypart {
        MORNING,
        AFTERNOON,
        EVENING
    }

    val Event.durationOfEvent: String
        get() = if (this.durationInMinutes < 60) {
            "short"
        } else {
            "long"
        }
}
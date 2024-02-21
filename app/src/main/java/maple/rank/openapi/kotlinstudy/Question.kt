package maple.rank.openapi.kotlinstudy


/**
 * 한가지 요소만 값이 다른경우 제네릭을 이용하여 해당 값의 타입을 지정하고
 * 실제 그 값의 타입은 호출부에서 결정
 */
data class Question<T> (
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
) {



}
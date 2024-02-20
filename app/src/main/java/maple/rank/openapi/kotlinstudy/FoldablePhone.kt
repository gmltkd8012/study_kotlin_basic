package maple.rank.openapi.kotlinstudy

/* 문제 6: 폴더블 스마트폰 */
class FoldablePhone (

) : Phone(isScreenLightOn = false){

    var isFold = false

    override fun switchOn() {
        if (!isFold) {
            super.switchOn()
        }
    }
}
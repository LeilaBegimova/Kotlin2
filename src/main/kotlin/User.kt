
data class User(
    var name: String,
    var address:String,
    var balance: Int =10000

) {
    init {
        if (balance in 1..100000) {

        } else {
            throw IllegalArgumentException("За раз можно пополнить только от 1 до 100000")
        }
    }
}

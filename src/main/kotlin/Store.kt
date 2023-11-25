class Store {
    private val products = mapOf(
        1 to Product("Манга", 10350),
        2 to Product("Дакимакура", 4075),
        3 to Product("Плакат", 1645),
        4 to Product("Фигурка", 3640),
        5 to Product("Крушка", 4567),
        6 to Product("Косплей", 1564),
        7 to Product("Значк", 7865),
        8 to Product("Артбук", 3450),
    )


    fun printAllProducts() {
        products.forEach { (id, product) ->
            println("ID: $id, Название: ${product.name}, Цена: ${product.price}")
        }
    }

    fun buy(productId: Int, user: User) {
        when (productId) {
            in products.keys -> {
                val product = products[productId]!!
                val totalPrice = product.price

                if (totalPrice <= user.balance) {
                    user.balance -= totalPrice

                    println("Вы купили: ${product.name}")
                    println("Списано с баланса: $totalPrice")
                    println("Адрес доставки: ${user.address}")
                    println("Остаток на балансе: ${user.balance}")
                } else {
                    println("Недостаточно средств на балансе")
                }
            }

            else -> {
                println("Вы ввели неверный ID товара")
            }
        }
    }
}



























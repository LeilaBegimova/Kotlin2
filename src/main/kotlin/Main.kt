   fun main(args: Array<String>) {
       val store = Store()

       val user = User("Leila", "ул. Pushkin, 21").apply {
           balance += 50000
       }

       val scanner = java.util.Scanner(System.`in`)

       println("Все товары в магазине:")
       store.printAllProducts()

       print("Введите ID товара, который вы хотите купить: ")
       val productId = scanner.nextInt()

       store.buy(productId, user)

       with(store) {
           printAllProducts()
       }

   }
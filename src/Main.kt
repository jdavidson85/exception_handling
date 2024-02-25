import java.util.*

fun calTip() {
    val scanner = Scanner(System.`in`)
    var totalCost = 0.0

    try {
        while (true) {
            print("Enter the cost of the item (or 0 to finish): ")
            val cost = scanner.nextDouble()

            if (cost == 0.0) {
                break
            }

            totalCost += cost
        }

        val taxes = totalCost * 0.025
        val totalWithTaxes = totalCost + taxes
        val tip = totalWithTaxes * 0.175

        println("Total Cost: $${"%.2f".format(totalCost)}")
        println("Taxes (2.5%): $${"%.2f".format(taxes)}")
        println("Total with Taxes: $${"%.2f".format(totalWithTaxes)}")
        println("Recommended Tip (17.5%): $${"%.2f".format(tip)}")

    } catch (e: InputMismatchException) {
        println("Invalid input. Please enter a valid cost.")
    } finally {
        scanner.close()
    }
}

fun main() {
    calTip()
}
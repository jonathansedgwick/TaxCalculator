import java.text.DecimalFormat

fun main() {
    var totalCost = 0.0
    var input: Double
    do  {
        print("Enter cost: ")
        input = readln()!!.toDouble()
        totalCost += input
    } while (input != 0.0)
    var taxes = totalCost * .025
    var totalTaxCost = totalCost + taxes
    var tip = totalTaxCost * .175
    var round = DecimalFormat("#,###.00")
    var total = round.format(totalCost)
    var tax= round.format(taxes)
    var taxTotal = round.format(totalTaxCost)
    var roundedTip = round.format(tip)

    println("Total cost: $$total")
    println("Taxes: $$tax")
    println("Total cost with taxes: $$taxTotal")
    println("17.5% tip: $$roundedTip")





}
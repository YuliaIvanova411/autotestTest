val accountType = "Maestro"
val amountThisMonth = 50
val amount = 5000
const val MAX_DAY = 150000
const val MAX_MONTH = 600000
const val MAX_VK = 15000
const val MAX_VK_MONTH = 40000

fun commission (account : String, amountTM : Int, amount : Int) : Int = when {
    (((account == "MasterCard") || (account == "Maestro")) && (amountTM in (300..75000))) -> 0
    account == "VKPay" -> 0
    account == "Visa" || account == "Мир" -> (amount*0.0075).toInt()
    else -> (amount * 0.006 + 20).toInt()
}


fun main() {
    val mayPay = when {
        accountType!== "VKPay" && (amount > MAX_DAY || amountThisMonth > MAX_MONTH) -> false
        accountType == "VKPay" && (amount > MAX_VK || amountThisMonth > MAX_VK_MONTH) -> false
        else -> true}

    if (mayPay) println("Ваша комиссия составит " + commission(accountType, amountThisMonth, amount) + " руб.")
    else println("Вы превысили лимит.")

}

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commissionElse() {
        val accountType = "Maestro"
        val amountThisMonth = 50
        val amount = 5000

        val result = commission(
            account = accountType,
            amountTM = amountThisMonth,
            amount = amount
        )
        assertEquals(50, result)
    }

    @Test
    fun commissionNoCommisionMasterCard() {
        val accountType = "MasterCard"
        val amountThisMonth = 500
        val amount = 5000

        val result = commission(
            account = accountType,
            amountTM = amountThisMonth,
            amount = amount
        )
        assertEquals(0, result)
    }

    @Test
    fun commissionNoCommisionMaestro() {
        val accountType = "Maestro"
        val amountThisMonth = 500
        val amount = 5000

        val result = commission(
            account = accountType,
            amountTM = amountThisMonth,
            amount = amount
        )
        assertEquals(0, result)
    }

    @Test
    fun commissionNoCommisionVKPay() {
        val accountType = "VKPay"
        val amountThisMonth = 500
        val amount = 5000

        val result = commission(
            account = accountType,
            amountTM = amountThisMonth,
            amount = amount
        )
        assertEquals(0, result)
    }

    @Test
    fun commissionVisa() {
        val accountType = "Visa"
        val amountThisMonth = 500
        val amount = 5000

        val result = commission(
            account = accountType,
            amountTM = amountThisMonth,
            amount = amount
        )
        assertEquals(37, result)
    }

    @Test
    fun commissionMir() {
        val accountType = "Мир"
        val amountThisMonth = 500
        val amount = 5000

        val result = commission(
            account = accountType,
            amountTM = amountThisMonth,
            amount = amount
        )
        assertEquals(37, result)
    }

    @Test
    fun mainOk() {
        val accountType = "Visa"
        val amountThisMonth = 500
        val amount = 5000
        val maxDay = 150000
        val maxMonth = 600000
        val maxVk = 15000
        val maxVkMonth = 40000


        val result = mayPay(
        accountType = accountType,
        amountThisMonth = amountThisMonth,
        amount = amount)
        assertEquals(true, result)
    }

    @Test
    fun mainOkMore() {
        val accountType = "MasterCard"
        val amountThisMonth = 500
        val amount = 5000
        val maxDay = 150000
        val maxMonth = 600000
        val maxVk = 15000
        val maxVkMonth = 40000


        val result = mayPay(
            accountType = accountType,
            amountThisMonth = amountThisMonth,
            amount = amount)
        assertEquals(true, result)
    }

    @Test
    fun mainOkOneMore() {
        val accountType = "Maestro"
        val amountThisMonth = 500
        val amount = 5000
        val maxDay = 150000
        val maxMonth = 600000
        val maxVk = 15000
        val maxVkMonth = 40000


        val result = mayPay(
            accountType = accountType,
            amountThisMonth = amountThisMonth,
            amount = amount
        )
        assertEquals(true, result)
    }
    @Test
    fun mainCantPayVkBigDay() {
        val accountType = "VKPay"
        val amountThisMonth = 500
        val amount = 50000
        val maxDay = 150000
        val maxMonth = 600000
        val maxVk = 15000
        val maxVkMonth = 40000


        val result = mayPay(
            accountType = accountType,
            amountThisMonth = amountThisMonth,
            amount = amount
        )
        assertEquals(false, result)
    }
    @Test
    fun mainCantPayVkBigMonth() {
        val accountType = "VKPay"
        val amountThisMonth = 50000
        val amount = 5000
        val maxDay = 150000
        val maxMonth = 600000
        val maxVk = 15000
        val maxVkMonth = 40000

        val result = mayPay(
            accountType = accountType,
            amountThisMonth = amountThisMonth,
            amount = amount
        )
        assertEquals(false, result)
    }
    @Test
    fun mainCantPayBigMonth() {
        val accountType = "Visa"
        val amountThisMonth = 5000000
        val amount = 5000
        val maxDay = 150000
        val maxMonth = 600000
        val maxVk = 15000
        val maxVkMonth = 40000


        val result = mayPay(
            accountType = accountType,
            amountThisMonth = amountThisMonth,
            amount = amount
        )
        assertEquals(false, result)
    }
    @Test
    fun mainCantPayBigDay() {
        val accountType = "MasterCard"
        val amountThisMonth = 50000
        val amount = 200000
        val maxDay = 150000
        val maxMonth = 600000
        val maxVk = 15000
        val maxVkMonth = 40000

        val result = mayPay(
            accountType = accountType,
            amountThisMonth = amountThisMonth,
            amount = amount
        )
        assertEquals(false, result)
    }
    @Test
    fun mainOkVkpayDay() {
        val accountType = "VKPay"
        val amountThisMonth = 500
        val amount = 5000
        val maxDay = 150000
        val maxMonth = 600000
        val maxVk = 15000
        val maxVkMonth = 40000


        val result = mayPay(
            accountType = accountType,
            amountThisMonth = amountThisMonth,
            amount = amount
        )
        assertEquals(true, result)
    }

    @Test
    fun mainOkVkpayMonth() {
        val accountType = "VKPay"
        val amountThisMonth = 500
        val amount = 5000
        val maxDay = 150000
        val maxMonth = 600000
        val maxVk = 15000
        val maxVkMonth = 40000


        val result = mayPay(
            accountType = accountType,
            amountThisMonth = amountThisMonth,
            amount = amount
        )
        assertEquals(true, result)
    }
}
@Test
fun main() {
    val accountType = "Visa"
    val amountThisMonth = 5000000
    val amount = 5000
    val maxDay = 150000
    val maxMonth = 600000
    val maxVk = 15000
    val maxVkMonth = 40000

    val result = main()
    assertEquals("Ваша комиссия составит " + commission(accountType, amountThisMonth, amount) + " руб.", result)
}
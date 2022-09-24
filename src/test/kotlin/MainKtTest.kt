import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commission() {
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
}
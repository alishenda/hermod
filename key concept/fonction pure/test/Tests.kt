import org.junit.Assert
import org.junit.Test

class Test {

    @Test fun testExercice1() {
        val input = listOf("lorem", "ipsum", "dolor", "sit", "amet", "dalar", "Dilir")
        val expected = listOf("DOLOR", "DALAR", "DILIR")
        Assert.assertEquals(expected, filterAndCapitalize(input, 'd'))
    }

    @Test fun testExercice2() {
        val input = listOf(1, 2, 3, 4, 5)
        val expected = 20
        Assert.assertEquals(expected, sumOfSquaresOfEven(input))
    }

    @Test fun testExercice3() {
        val transactions = listOf(
            Transaction(id = 1, amount = 100.0, date = "2022-07-01"),
            Transaction(id = 2, amount = -50.0, date = "2022-07-01"),
            Transaction(id = 3, amount = 200.0, date = "2022-07-02"),
            Transaction(id = 4, amount = -30.0, date = "2022-07-02"),
            Transaction(id = 5, amount = 150.0, date = "2022-07-01")
        )

        // Exécution de la fonction à tester
        val result = analyzeTransactions(transactions)

        // Vérifications des résultats attendus
        Assert.assertEquals(450.0, result.totalDeposits, 0.0)
        Assert.assertEquals(80.0, result.totalWithdrawals, 0.0)
        Assert.assertEquals(370.0, result.balance, 0.0)
        Assert.assertEquals(mapOf("2022-07-01" to 3, "2022-07-02" to 2), result.transactionsPerDate)
    }
}
import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {

        val numbers = listOf(1, 2, 3, 4, 5)

        Assert.assertEquals(8, double()(4))
        Assert.assertEquals(9, triple()(3))
        Assert.assertEquals(20, quadruple()(5))


        Assert.assertEquals(120, numbers.customReduce(1){ acc, i -> acc * i })
        Assert.assertEquals(15, numbers.customReduce(0){ acc, i -> acc + i })

        Assert.assertEquals(120, numbers.customReduceRecursion(1){ acc, i -> acc * i })
        Assert.assertEquals(15, numbers.customReduceRecursion(0){ acc, i -> acc + i })

    }
}
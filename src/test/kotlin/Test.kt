import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Test{
    @Test
    internal fun test1() {
        val x = runTask(5,5)
        assertEquals(10,x)
    }
}
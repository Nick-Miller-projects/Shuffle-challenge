import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ShuffleCheckerTest {

    @Test
    fun testCorrectShuffles() {
        assertTrue(isLegitimateShuffle("TOURNAMENT", "DINNER", "TDINOURNANMENTER"))
        assertTrue(isLegitimateShuffle("TOURNAMENT", "DINNER", "DINTOUR"))
        assertTrue(isLegitimateShuffle("COMPUTER", "SCIENCE", "COMSCPIEUNTERCE"))
        assertTrue(isLegitimateShuffle("FUNCTIONAL", "PROGRAMMING", "FPUNCTIONALROGRAMMING"))
    }

    @Test
    fun testIncorrectShuffles() {
        assertFalse(isLegitimateShuffle("TOURNAMENT", "DINNER", "TOUINN"))
        assertFalse(isLegitimateShuffle("HELLO ", "WORLD ", "HOLWORLDLE"))
        assertFalse(isLegitimateShuffle("COMPUTER", "SCIENCE", "CSEOCMIPEUNTREX"))
        assertFalse(isLegitimateShuffle("ALGORITHM", "DATASTRUCTURE", "ADLTAOGIRTSHMTRUCTURE"))
    }
}
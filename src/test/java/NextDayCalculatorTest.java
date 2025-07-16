import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void testNextDay01012018() {
        assertEquals("2/1/2018", NextDayCalculator.getNextDay(1, 1, 2018));
    }

    @Test
    void testNextDay31012018() {
        assertEquals("1/2/2018", NextDayCalculator.getNextDay(31, 1, 2018));
    }

    @Test
    void testNextDay30042018() {
        assertEquals("1/5/2018", NextDayCalculator.getNextDay(30, 4, 2018));
    }

    @Test
    void testNextDay28022018() {
        assertEquals("1/3/2018", NextDayCalculator.getNextDay(28, 2, 2018));
    }

    @Test
    void testNextDay29022020() {
        assertEquals("1/3/2020", NextDayCalculator.getNextDay(29, 2, 2020));
    }

    @Test
    void testNextDay31122018() {
        assertEquals("1/1/2019", NextDayCalculator.getNextDay(31, 12, 2018));
    }
}

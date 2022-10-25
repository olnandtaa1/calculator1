import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class MainCalculatorTest {

    @Test
    public void add() {
        MainCalculator calculator = new MainCalculator();
        int result = calculator.add(5, 7);
        assertEquals(12, result);
    }

    @Test
    public void sub() {
        MainCalculator calculator = new MainCalculator();
        int result = calculator.sub(10, 3);
        assertEquals(7, result);
    }

    @Test
    public void multiply() {
        MainCalculator calculator = new MainCalculator();
        int result = calculator.multiply(3, 5);
        assertEquals(15, result);
    }

    @Test
    public void divide() {
        MainCalculator calculator = new MainCalculator();
        int result = calculator.divide(20, 4);
        assertEquals(5, result);
    }
}
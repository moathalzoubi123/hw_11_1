import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(4,5, 34.54, 65.98);
    }

    @Test
    public void addNum(){
        assertEquals(9, calculator.addNum());
    }

    @Test
    public void subNum(){
        assertEquals(1, calculator.subNum());
    }

    @Test
    public void multiplyNum() {
        assertEquals(20, calculator.multiplyNum());
    }

    @Test
    public void divideNum () {
        assertEquals(1.91024899, calculator.divideNum(), 0.0000001);
    }
}

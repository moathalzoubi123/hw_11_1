import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() {waterBottle = new WaterBottle(100);}

    @Test
    public void decTen() {
        assertEquals(90, waterBottle.decTen());
    }

    @Test

    public void setToZero() {
        assertEquals(0 , waterBottle.setToZero());
    }

    @Test

    public void fillTo100 () {
        assertEquals(100 , waterBottle.fillTo100(100));
    }

}

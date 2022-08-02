import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() { printer = new Printer(60, 40);}


    @Test

    public void print () {
        assertEquals(30 , printer.print(3,10));
        //assertEquals(39, );
    }

}
